package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
public abstract class xkd extends ibd {
    private static Map<Object, xkd> zzjr = new ConcurrentHashMap();
    protected g0e zzjp;
    private int zzjq;

    public xkd() {
        this.zzex = 0;
        this.zzjp = g0e.e;
        this.zzjq = -1;
    }

    public static Object b(Method method, xkd xkdVar, Object... objArr) {
        Throwable e;
        String str;
        try {
            return method.invoke(xkdVar, objArr);
        } catch (IllegalAccessException e2) {
            e = e2;
            str = "Couldn't use Java reflection to implement protocol message reflection.";
            rjb.k(str, e);
            return null;
        } catch (InvocationTargetException e3) {
            e = e3.getCause();
            if (!(e instanceof RuntimeException)) {
                if (!(e instanceof Error)) {
                    str = "Unexpected exception thrown by generated accessor method.";
                    rjb.k(str, e);
                    return null;
                }
                throw ((Error) e);
            }
            throw ((RuntimeException) e);
        }
    }

    public static void c(Class cls, xkd xkdVar) {
        zzjr.put(cls, xkdVar);
    }

    public static xkd d(Class cls) {
        String str;
        xkd xkdVar = zzjr.get(cls);
        if (xkdVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                xkdVar = zzjr.get(cls);
            } catch (ClassNotFoundException e) {
                wa3.h("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (xkdVar == null) {
            String name = cls.getName();
            if (name.length() != 0) {
                str = "Unable to get default instance for: ".concat(name);
            } else {
                str = new String("Unable to get default instance for: ");
            }
            throw new IllegalStateException(str);
        }
        return xkdVar;
    }

    public abstract Object a(int i);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((xkd) a(6)).getClass().isInstance(obj)) {
            return false;
        }
        wvd wvdVar = wvd.c;
        wvdVar.getClass();
        return wvdVar.a(getClass()).f(this, (xkd) obj);
    }

    public final int hashCode() {
        int i = this.zzex;
        if (i != 0) {
            return i;
        }
        wvd wvdVar = wvd.c;
        wvdVar.getClass();
        int e = wvdVar.a(getClass()).e(this);
        this.zzex = e;
        return e;
    }

    public final String toString() {
        String obj = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        lgd.b(this, sb, 0);
        return sb.toString();
    }
}
