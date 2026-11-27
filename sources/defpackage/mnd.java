package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
public abstract class mnd extends zdd {
    private static Map<Object, mnd> zzjr = new ConcurrentHashMap();
    protected t2e zzjp;
    private int zzjq;

    public mnd() {
        this.zzex = 0;
        this.zzjp = t2e.e;
        this.zzjq = -1;
    }

    public static Object b(Method method, mnd mndVar, Object... objArr) {
        Throwable e;
        String str;
        try {
            return method.invoke(mndVar, objArr);
        } catch (IllegalAccessException e2) {
            e = e2;
            str = "Couldn't use Java reflection to implement protocol message reflection.";
            grb.j(str, e);
            return null;
        } catch (InvocationTargetException e3) {
            e = e3.getCause();
            if (!(e instanceof RuntimeException)) {
                if (!(e instanceof Error)) {
                    str = "Unexpected exception thrown by generated accessor method.";
                    grb.j(str, e);
                    return null;
                }
                throw ((Error) e);
            }
            throw ((RuntimeException) e);
        }
    }

    public static void c(Class cls, mnd mndVar) {
        zzjr.put(cls, mndVar);
    }

    public static mnd d(Class cls) {
        String str;
        mnd mndVar = zzjr.get(cls);
        if (mndVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                mndVar = zzjr.get(cls);
            } catch (ClassNotFoundException e) {
                su3.f("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (mndVar == null) {
            String name = cls.getName();
            if (name.length() != 0) {
                str = "Unable to get default instance for: ".concat(name);
            } else {
                str = new String("Unable to get default instance for: ");
            }
            throw new IllegalStateException(str);
        }
        return mndVar;
    }

    public abstract Object a(int i);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((mnd) a(6)).getClass().isInstance(obj)) {
            return false;
        }
        jyd jydVar = jyd.c;
        jydVar.getClass();
        return jydVar.a(getClass()).f(this, (mnd) obj);
    }

    public final int hashCode() {
        int i = this.zzex;
        if (i != 0) {
            return i;
        }
        jyd jydVar = jyd.c;
        jydVar.getClass();
        int e = jydVar.a(getClass()).e(this);
        this.zzex = e;
        return e;
    }

    public final String toString() {
        String obj = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        bjd.b(this, sb, 0);
        return sb.toString();
    }
}
