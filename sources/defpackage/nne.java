package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
public abstract class nne extends qde {
    private static Map<Object, nne> zzd = new ConcurrentHashMap();
    protected qze zzb;
    private int zzc;

    public nne() {
        this.zza = 0;
        this.zzb = qze.f;
        this.zzc = -1;
    }

    public static Object e(Method method, nne nneVar, Object... objArr) {
        try {
            return method.invoke(nneVar, objArr);
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

    public static nne f(Class cls) {
        nne nneVar = zzd.get(cls);
        if (nneVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                nneVar = zzd.get(cls);
            } catch (ClassNotFoundException e) {
                k93.h("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (nneVar == null) {
            try {
                nne nneVar2 = (nne) ((nne) i0f.a.allocateInstance(cls)).d(6);
                if (nneVar2 != null) {
                    zzd.put(cls, nneVar2);
                    return nneVar2;
                }
                sdb.a();
                return null;
            } catch (InstantiationException e2) {
                ho9.n(e2);
                return null;
            }
        }
        return nneVar;
    }

    public static void g(Class cls, nne nneVar) {
        zzd.put(cls, nneVar);
    }

    public static zoe i() {
        return wne.d;
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
        fwe fweVar = fwe.c;
        fweVar.getClass();
        return fweVar.a(getClass()).f(this, (nne) obj);
    }

    public final int h() {
        int i = this.zzc;
        if (i == -1) {
            fwe fweVar = fwe.c;
            fweVar.getClass();
            int zzb = fweVar.a(getClass()).zzb(this);
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
        fwe fweVar = fwe.c;
        fweVar.getClass();
        int g = fweVar.a(getClass()).g(this);
        this.zza = g;
        return g;
    }

    public final String toString() {
        String obj = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        fkd.c(this, sb, 0);
        return sb.toString();
    }
}
