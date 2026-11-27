package defpackage;

import java.lang.reflect.InvocationTargetException;
public final class eq4 {
    public static final vla b = new vla(0);
    public final kq4 a;

    public eq4(kq4 kq4Var) {
        this.a = kq4Var;
    }

    public static Class b(ClassLoader classLoader, String str) {
        vla vlaVar = b;
        vla vlaVar2 = (vla) vlaVar.get(classLoader);
        if (vlaVar2 == null) {
            vlaVar2 = new vla(0);
            vlaVar.put(classLoader, vlaVar2);
        }
        Class cls = (Class) vlaVar2.get(str);
        if (cls == null) {
            Class<?> cls2 = Class.forName(str, false, classLoader);
            vlaVar2.put(str, cls2);
            return cls2;
        }
        return cls;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e) {
            throw new RuntimeException(qd4.y("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException(qd4.y("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }

    public final gp4 a(String str) {
        try {
            return (gp4) c(this.a.w.b.getClassLoader(), str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(qd4.y("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(qd4.y("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException(qd4.y("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(qd4.y("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }
}
