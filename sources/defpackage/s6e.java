package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
public abstract class s6e extends hwd {
    private static final Map zzb = new ConcurrentHashMap();
    protected zie zzc;
    private int zzd;

    public s6e() {
        this.zza = 0;
        this.zzd = -1;
        this.zzc = zie.f;
    }

    public static final boolean c(s6e s6eVar, boolean z) {
        byte byteValue = ((Byte) s6eVar.d(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean d = zee.c.a(s6eVar.getClass()).d(s6eVar);
        if (z) {
            s6eVar.d(2);
        }
        return d;
    }

    public static s6e h(Class cls) {
        Map map = zzb;
        s6e s6eVar = (s6e) map.get(cls);
        if (s6eVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                s6eVar = (s6e) map.get(cls);
            } catch (ClassNotFoundException e) {
                su3.f("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (s6eVar == null) {
            try {
                s6e s6eVar2 = (s6e) ((s6e) eke.a.allocateInstance(cls)).d(6);
                if (s6eVar2 != null) {
                    map.put(cls, s6eVar2);
                    return s6eVar2;
                }
                grb.g();
                return null;
            } catch (InstantiationException e2) {
                vr9.l(e2);
                return null;
            }
        }
        return s6eVar;
    }

    public static Object i(Method method, s6e s6eVar, Object... objArr) {
        try {
            return method.invoke(s6eVar, objArr);
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

    public static void k(Class cls, s6e s6eVar) {
        s6eVar.j();
        zzb.put(cls, s6eVar);
    }

    @Override
    public final int b(rfe rfeVar) {
        if (m()) {
            int e = rfeVar.e(this);
            if (e >= 0) {
                return e;
            }
            grb.i(uh9.k(e, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i == Integer.MAX_VALUE) {
            int e2 = rfeVar.e(this);
            if (e2 >= 0) {
                this.zzd = (this.zzd & Integer.MIN_VALUE) | e2;
                return e2;
            }
            grb.i(uh9.k(e2, "serialized size must be non-negative, was "));
            return 0;
        }
        return i;
    }

    public abstract Object d(int i);

    public final int e() {
        if (m()) {
            int e = zee.c.a(getClass()).e(this);
            if (e >= 0) {
                return e;
            }
            grb.i(uh9.k(e, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int e2 = zee.c.a(getClass()).e(this);
        if (e2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | e2;
            return e2;
        }
        grb.i(uh9.k(e2, "serialized size must be non-negative, was "));
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zee.c.a(getClass()).b(this, (s6e) obj);
    }

    public final u4e f() {
        return (u4e) d(5);
    }

    public final u4e g() {
        u4e u4eVar = (u4e) d(5);
        if (!u4eVar.a.equals(this)) {
            if (!u4eVar.b.m()) {
                s6e s6eVar = (s6e) u4eVar.a.d(4);
                zee.c.a(s6eVar.getClass()).zzg(s6eVar, u4eVar.b);
                u4eVar.b = s6eVar;
            }
            s6e s6eVar2 = u4eVar.b;
            zee.c.a(s6eVar2.getClass()).zzg(s6eVar2, this);
        }
        return u4eVar;
    }

    public final int hashCode() {
        if (!m()) {
            int i = this.zza;
            if (i == 0) {
                int c = zee.c.a(getClass()).c(this);
                this.zza = c;
                return c;
            }
            return i;
        }
        return zee.c.a(getClass()).c(this);
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
        char[] cArr = wde.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        wde.c(this, sb, 0);
        return sb.toString();
    }
}
