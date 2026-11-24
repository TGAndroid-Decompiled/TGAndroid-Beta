package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
public abstract class c2e extends rrd {
    private static final Map zzb = new ConcurrentHashMap();
    protected iee zzc;
    private int zzd;

    public c2e() {
        this.zza = 0;
        this.zzd = -1;
        this.zzc = iee.f;
    }

    public static final boolean c(c2e c2eVar, boolean z) {
        byte byteValue = ((Byte) c2eVar.d(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean d = jae.c.a(c2eVar.getClass()).d(c2eVar);
        if (z) {
            c2eVar.d(2);
        }
        return d;
    }

    public static c2e h(Class cls) {
        Map map = zzb;
        c2e c2eVar = (c2e) map.get(cls);
        if (c2eVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                c2eVar = (c2e) map.get(cls);
            } catch (ClassNotFoundException e) {
                k93.h("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (c2eVar == null) {
            try {
                c2e c2eVar2 = (c2e) ((c2e) nfe.a.allocateInstance(cls)).d(6);
                if (c2eVar2 != null) {
                    map.put(cls, c2eVar2);
                    return c2eVar2;
                }
                sdb.a();
                return null;
            } catch (InstantiationException e2) {
                ho9.n(e2);
                return null;
            }
        }
        return c2eVar;
    }

    public static Object i(Method method, c2e c2eVar, Object... objArr) {
        try {
            return method.invoke(c2eVar, objArr);
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

    public static void k(Class cls, c2e c2eVar) {
        c2eVar.j();
        zzb.put(cls, c2eVar);
    }

    @Override
    public final int b(bbe bbeVar) {
        if (m()) {
            int e = bbeVar.e(this);
            if (e >= 0) {
                return e;
            }
            sc8.j(de9.k(e, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i == Integer.MAX_VALUE) {
            int e2 = bbeVar.e(this);
            if (e2 >= 0) {
                this.zzd = (this.zzd & Integer.MIN_VALUE) | e2;
                return e2;
            }
            sc8.j(de9.k(e2, "serialized size must be non-negative, was "));
            return 0;
        }
        return i;
    }

    public abstract Object d(int i);

    public final int e() {
        if (m()) {
            int e = jae.c.a(getClass()).e(this);
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
        int e2 = jae.c.a(getClass()).e(this);
        if (e2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | e2;
            return e2;
        }
        sc8.j(de9.k(e2, "serialized size must be non-negative, was "));
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return jae.c.a(getClass()).b(this, (c2e) obj);
    }

    public final e0e f() {
        return (e0e) d(5);
    }

    public final e0e g() {
        e0e e0eVar = (e0e) d(5);
        if (!e0eVar.a.equals(this)) {
            if (!e0eVar.b.m()) {
                c2e c2eVar = (c2e) e0eVar.a.d(4);
                jae.c.a(c2eVar.getClass()).zzg(c2eVar, e0eVar.b);
                e0eVar.b = c2eVar;
            }
            c2e c2eVar2 = e0eVar.b;
            jae.c.a(c2eVar2.getClass()).zzg(c2eVar2, this);
        }
        return e0eVar;
    }

    public final int hashCode() {
        if (!m()) {
            int i = this.zza;
            if (i == 0) {
                int c = jae.c.a(getClass()).c(this);
                this.zza = c;
                return c;
            }
            return i;
        }
        return jae.c.a(getClass()).c(this);
    }

    public final void j() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final void l() {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final boolean m() {
        if ((this.zzd & Integer.MIN_VALUE) != 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = g9e.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        g9e.c(this, sb, 0);
        return sb.toString();
    }
}
