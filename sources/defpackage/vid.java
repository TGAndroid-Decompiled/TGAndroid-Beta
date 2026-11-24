package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
public abstract class vid extends g9d {
    private static Map<Object, vid> zzjr = new ConcurrentHashMap();
    protected dyd zzjp;
    private int zzjq;

    public vid() {
        this.zzex = 0;
        this.zzjp = dyd.e;
        this.zzjq = -1;
    }

    public static Object b(Method method, vid vidVar, Object... objArr) {
        Throwable e;
        String str;
        try {
            return method.invoke(vidVar, objArr);
        } catch (IllegalAccessException e2) {
            e = e2;
            str = "Couldn't use Java reflection to implement protocol message reflection.";
            fyb.j(str, e);
            return null;
        } catch (InvocationTargetException e3) {
            e = e3.getCause();
            if (!(e instanceof RuntimeException)) {
                if (!(e instanceof Error)) {
                    str = "Unexpected exception thrown by generated accessor method.";
                    fyb.j(str, e);
                    return null;
                }
                throw ((Error) e);
            }
            throw ((RuntimeException) e);
        }
    }

    public static void c(Class cls, vid vidVar) {
        zzjr.put(cls, vidVar);
    }

    public static vid d(Class cls) {
        String str;
        vid vidVar = zzjr.get(cls);
        if (vidVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                vidVar = zzjr.get(cls);
            } catch (ClassNotFoundException e) {
                k93.h("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (vidVar == null) {
            String name = cls.getName();
            if (name.length() != 0) {
                str = "Unable to get default instance for: ".concat(name);
            } else {
                str = new String("Unable to get default instance for: ");
            }
            throw new IllegalStateException(str);
        }
        return vidVar;
    }

    public abstract Object a(int i);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((vid) a(6)).getClass().isInstance(obj)) {
            return false;
        }
        ttd ttdVar = ttd.c;
        ttdVar.getClass();
        return ttdVar.a(getClass()).f(this, (vid) obj);
    }

    public final int hashCode() {
        int i = this.zzex;
        if (i != 0) {
            return i;
        }
        ttd ttdVar = ttd.c;
        ttdVar.getClass();
        int e = ttdVar.a(getClass()).e(this);
        this.zzex = e;
        return e;
    }

    public final String toString() {
        String obj = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        ked.b(this, sb, 0);
        return sb.toString();
    }
}
