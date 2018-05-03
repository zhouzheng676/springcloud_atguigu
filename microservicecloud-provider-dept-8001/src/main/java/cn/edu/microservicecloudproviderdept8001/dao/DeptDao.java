package cn.edu.microservicecloudproviderdept8001.dao;

import java.util.List;

import cn.edu.microservicecloudapi.entities.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface DeptDao
{
	public boolean addDept(Dept dept);

	public Dept findById(Long id);

	public List<Dept> findAll();
}