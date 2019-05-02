package entity;

/**
 * @author 赵鑫
 * @create 2019-05-02 21:45
 */
public class Student {
//    属性：学号，姓名，班级
    private int num;
    private String name;
    private int clazz;

//    无参构造方法
    public Student() {
    }

//    所有参数的构造方法
    public Student(int num, String name, int clazz) {
        this.num = num;
        this.name = name;
        this.clazz = clazz;
    }

//    对外暴露getter和setter方法

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getClazz() {
        return clazz;
    }

    public void setClazz(int clazz) {
        this.clazz = clazz;
    }
}
