package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
public abstract class wgf extends kff {
    private static final Map zzb = new ConcurrentHashMap();
    protected djf zzc;
    private int zzd;

    public wgf() {
        this.zza = 0;
        this.zzd = -1;
        this.zzc = djf.e;
    }

    public static ehf b(ehf ehfVar) {
        int i;
        int size = ehfVar.size();
        if (size == 0) {
            i = 10;
        } else {
            i = size << 1;
        }
        return ehfVar.zzg(i);
    }

    public static Object c(Method method, wgf wgfVar, Object... objArr) {
        try {
            return method.invoke(wgfVar, objArr);
        } catch (IllegalAccessException e) {
            rjb.k("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (!(cause instanceof Error)) {
                    rjb.k("Unexpected exception thrown by generated accessor method.", cause);
                    return null;
                }
                throw ((Error) cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static void e(Class cls, wgf wgfVar) {
        wgfVar.d();
        zzb.put(cls, wgfVar);
    }

    public static wgf k(Class cls) {
        Map map = zzb;
        wgf wgfVar = (wgf) map.get(cls);
        if (wgfVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                wgfVar = (wgf) map.get(cls);
            } catch (ClassNotFoundException e) {
                wa3.h("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (wgfVar == null) {
            try {
                wgf wgfVar2 = (wgf) ((wgf) hjf.a.allocateInstance(cls)).h(6, null);
                if (wgfVar2 != null) {
                    map.put(cls, wgfVar2);
                    return wgfVar2;
                }
                rjb.h();
                return null;
            } catch (InstantiationException e2) {
                dq9.o(e2);
                return null;
            }
        }
        return wgfVar;
    }

    @Override
    public final int a(uif uifVar) {
        if (g()) {
            int e = uifVar.e(this);
            if (e >= 0) {
                return e;
            }
            dq9.m(hg9.j(e, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i == Integer.MAX_VALUE) {
            int e2 = uifVar.e(this);
            if (e2 >= 0) {
                this.zzd = (this.zzd & Integer.MIN_VALUE) | e2;
                return e2;
            }
            dq9.m(hg9.j(e2, "serialized size must be non-negative, was "));
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
        return rif.c.a(getClass()).b(this, (wgf) obj);
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

    public abstract Object h(int i, wgf wgfVar);

    public final int hashCode() {
        if (!g()) {
            int i = this.zza;
            if (i == 0) {
                int f = rif.c.a(getClass()).f(this);
                this.zza = f;
                return f;
            }
            return i;
        }
        return rif.c.a(getClass()).f(this);
    }

    public final int i() {
        if (g()) {
            int e = rif.c.a(getClass()).e(this);
            if (e >= 0) {
                return e;
            }
            dq9.m(hg9.j(e, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int e2 = rif.c.a(getClass()).e(this);
        if (e2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | e2;
            return e2;
        }
        dq9.m(hg9.j(e2, "serialized size must be non-negative, was "));
        return 0;
    }

    public final vgf j() {
        return (vgf) h(5, null);
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = fif.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        fif.c(this, sb, 0);
        return sb.toString();
    }
}
