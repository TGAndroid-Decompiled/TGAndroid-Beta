package defpackage;

import java.lang.reflect.InvocationTargetException;
public final class ao4 {
    public static final aia b = new aia(0);
    public final go4 a;

    public ao4(go4 go4Var) {
        this.a = go4Var;
    }

    public static Class b(ClassLoader classLoader, String str) {
        aia aiaVar = b;
        aia aiaVar2 = (aia) aiaVar.get(classLoader);
        if (aiaVar2 == null) {
            aiaVar2 = new aia(0);
            aiaVar.put(classLoader, aiaVar2);
        }
        Class cls = (Class) aiaVar2.get(str);
        if (cls == null) {
            Class<?> cls2 = Class.forName(str, false, classLoader);
            aiaVar2.put(str, cls2);
            return cls2;
        }
        return cls;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e) {
            throw new RuntimeException(tb4.y("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException(tb4.y("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }

    public final bn4 a(String str) {
        try {
            return (bn4) c(this.a.w.b.getClassLoader(), str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(tb4.y("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(tb4.y("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException(tb4.y("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(tb4.y("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }
}
