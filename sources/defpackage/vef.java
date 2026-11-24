package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
public abstract class vef extends jdf {
    private static final Map zzb = new ConcurrentHashMap();
    protected chf zzc;
    private int zzd;

    public vef() {
        this.zza = 0;
        this.zzd = -1;
        this.zzc = chf.e;
    }

    public static dff b(dff dffVar) {
        int i;
        int size = dffVar.size();
        if (size == 0) {
            i = 10;
        } else {
            i = size << 1;
        }
        return dffVar.zzg(i);
    }

    public static Object c(Method method, vef vefVar, Object... objArr) {
        try {
            return method.invoke(vefVar, objArr);
        } catch (IllegalAccessException e) {
            fyb.j("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (!(cause instanceof Error)) {
                    fyb.j("Unexpected exception thrown by generated accessor method.", cause);
                    return null;
                }
                throw ((Error) cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static void e(Class cls, vef vefVar) {
        vefVar.d();
        zzb.put(cls, vefVar);
    }

    public static vef k(Class cls) {
        Map map = zzb;
        vef vefVar = (vef) map.get(cls);
        if (vefVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                vefVar = (vef) map.get(cls);
            } catch (ClassNotFoundException e) {
                k93.h("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (vefVar == null) {
            try {
                vef vefVar2 = (vef) ((vef) ghf.a.allocateInstance(cls)).h(6, null);
                if (vefVar2 != null) {
                    map.put(cls, vefVar2);
                    return vefVar2;
                }
                sdb.a();
                return null;
            } catch (InstantiationException e2) {
                ho9.n(e2);
                return null;
            }
        }
        return vefVar;
    }

    @Override
    public final int a(tgf tgfVar) {
        if (g()) {
            int e = tgfVar.e(this);
            if (e >= 0) {
                return e;
            }
            sc8.j(de9.k(e, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i == Integer.MAX_VALUE) {
            int e2 = tgfVar.e(this);
            if (e2 >= 0) {
                this.zzd = (this.zzd & Integer.MIN_VALUE) | e2;
                return e2;
            }
            sc8.j(de9.k(e2, "serialized size must be non-negative, was "));
            return 0;
        }
        return i;
    }

    public final void d() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return qgf.c.a(getClass()).b(this, (vef) obj);
    }

    public final void f() {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final boolean g() {
        if ((this.zzd & Integer.MIN_VALUE) != 0) {
            return true;
        }
        return false;
    }

    public abstract Object h(int i, vef vefVar);

    public final int hashCode() {
        if (!g()) {
            int i = this.zza;
            if (i == 0) {
                int f = qgf.c.a(getClass()).f(this);
                this.zza = f;
                return f;
            }
            return i;
        }
        return qgf.c.a(getClass()).f(this);
    }

    public final int i() {
        if (g()) {
            int e = qgf.c.a(getClass()).e(this);
            if (e >= 0) {
                return e;
            }
            sc8.j(de9.k(e, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int e2 = qgf.c.a(getClass()).e(this);
        if (e2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | e2;
            return e2;
        }
        sc8.j(de9.k(e2, "serialized size must be non-negative, was "));
        return 0;
    }

    public final uef j() {
        return (uef) h(5, null);
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = egf.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        egf.c(this, sb, 0);
        return sb.toString();
    }
}
