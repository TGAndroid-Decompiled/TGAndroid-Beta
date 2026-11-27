package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
public abstract class ese extends hie {
    private static Map<Object, ese> zzd = new ConcurrentHashMap();
    protected h4f zzb;
    private int zzc;

    public ese() {
        this.zza = 0;
        this.zzb = h4f.f;
        this.zzc = -1;
    }

    public static Object e(Method method, ese eseVar, Object... objArr) {
        try {
            return method.invoke(eseVar, objArr);
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

    public static ese f(Class cls) {
        ese eseVar = zzd.get(cls);
        if (eseVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                eseVar = zzd.get(cls);
            } catch (ClassNotFoundException e) {
                su3.f("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (eseVar == null) {
            try {
                ese eseVar2 = (ese) ((ese) a5f.a.allocateInstance(cls)).d(6);
                if (eseVar2 != null) {
                    zzd.put(cls, eseVar2);
                    return eseVar2;
                }
                grb.g();
                return null;
            } catch (InstantiationException e2) {
                vr9.l(e2);
                return null;
            }
        }
        return eseVar;
    }

    public static void g(Class cls, ese eseVar) {
        zzd.put(cls, eseVar);
    }

    public static qte i() {
        return nse.d;
    }

    @Override
    public final void b(int i) {
        this.zzc = i;
    }

    @Override
    public final int c() {
        return this.zzc;
    }

    public abstract Object d(int i);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        w0f w0fVar = w0f.c;
        w0fVar.getClass();
        return w0fVar.a(getClass()).f(this, (ese) obj);
    }

    public final int h() {
        int i = this.zzc;
        if (i == -1) {
            w0f w0fVar = w0f.c;
            w0fVar.getClass();
            int zzb = w0fVar.a(getClass()).zzb(this);
            this.zzc = zzb;
            return zzb;
        }
        return i;
    }

    public final int hashCode() {
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        w0f w0fVar = w0f.c;
        w0fVar.getClass();
        int g = w0fVar.a(getClass()).g(this);
        this.zza = g;
        return g;
    }

    public final String toString() {
        String obj = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        wod.c(this, sb, 0);
        return sb.toString();
    }
}
