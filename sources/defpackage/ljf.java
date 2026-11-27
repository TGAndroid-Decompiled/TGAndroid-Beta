package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
public abstract class ljf extends zhf {
    private static final Map zzb = new ConcurrentHashMap();
    protected slf zzc;
    private int zzd;

    public ljf() {
        this.zza = 0;
        this.zzd = -1;
        this.zzc = slf.e;
    }

    public static tjf b(tjf tjfVar) {
        int i;
        int size = tjfVar.size();
        if (size == 0) {
            i = 10;
        } else {
            i = size << 1;
        }
        return tjfVar.zzg(i);
    }

    public static Object c(Method method, ljf ljfVar, Object... objArr) {
        try {
            return method.invoke(ljfVar, objArr);
        } catch (IllegalAccessException e) {
            grb.j("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (!(cause instanceof Error)) {
                    grb.j("Unexpected exception thrown by generated accessor method.", cause);
                    return null;
                }
                throw ((Error) cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static void e(Class cls, ljf ljfVar) {
        ljfVar.d();
        zzb.put(cls, ljfVar);
    }

    public static ljf k(Class cls) {
        Map map = zzb;
        ljf ljfVar = (ljf) map.get(cls);
        if (ljfVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                ljfVar = (ljf) map.get(cls);
            } catch (ClassNotFoundException e) {
                su3.f("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (ljfVar == null) {
            try {
                ljf ljfVar2 = (ljf) ((ljf) wlf.a.allocateInstance(cls)).h(6, null);
                if (ljfVar2 != null) {
                    map.put(cls, ljfVar2);
                    return ljfVar2;
                }
                grb.g();
                return null;
            } catch (InstantiationException e2) {
                vr9.l(e2);
                return null;
            }
        }
        return ljfVar;
    }

    @Override
    public final int a(jlf jlfVar) {
        if (g()) {
            int d = jlfVar.d(this);
            if (d >= 0) {
                return d;
            }
            grb.i(uh9.k(d, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i == Integer.MAX_VALUE) {
            int d2 = jlfVar.d(this);
            if (d2 >= 0) {
                this.zzd = (this.zzd & Integer.MIN_VALUE) | d2;
                return d2;
            }
            grb.i(uh9.k(d2, "serialized size must be non-negative, was "));
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
        return glf.c.a(getClass()).b(this, (ljf) obj);
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

    public abstract Object h(int i, ljf ljfVar);

    public final int hashCode() {
        if (!g()) {
            int i = this.zza;
            if (i == 0) {
                int e = glf.c.a(getClass()).e(this);
                this.zza = e;
                return e;
            }
            return i;
        }
        return glf.c.a(getClass()).e(this);
    }

    public final int i() {
        if (g()) {
            int d = glf.c.a(getClass()).d(this);
            if (d >= 0) {
                return d;
            }
            grb.i(uh9.k(d, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int d2 = glf.c.a(getClass()).d(this);
        if (d2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | d2;
            return d2;
        }
        grb.i(uh9.k(d2, "serialized size must be non-negative, was "));
        return 0;
    }

    public final kjf j() {
        return (kjf) h(5, null);
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = ukf.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        ukf.c(this, sb, 0);
        return sb.toString();
    }
}
