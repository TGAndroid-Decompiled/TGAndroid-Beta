package m9;

import c8.r9;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;
public final class m extends r9 {
    public static final Unsafe f19984a;
    public static final long f19985b;
    public static final long f19986c;
    public static final long d;
    public static final long f19987e;
    public static final long f19988f;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (PrivilegedActionException e10) {
                throw new RuntimeException("Could not initialize intrinsics", e10.getCause());
            }
        } catch (SecurityException unused) {
            unsafe = (Unsafe) AccessController.doPrivileged((PrivilegedExceptionAction<Object>) new Object());
        }
        try {
            f19986c = unsafe.objectFieldOffset(o.class.getDeclaredField("c"));
            f19985b = unsafe.objectFieldOffset(o.class.getDeclaredField("b"));
            d = unsafe.objectFieldOffset(o.class.getDeclaredField("a"));
            f19987e = unsafe.objectFieldOffset(n.class.getDeclaredField("a"));
            f19988f = unsafe.objectFieldOffset(n.class.getDeclaredField("b"));
            f19984a = unsafe;
        } catch (NoSuchFieldException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override
    public final boolean a(o oVar, c cVar, c cVar2) {
        return j.a(f19984a, oVar, f19985b, cVar, cVar2);
    }

    @Override
    public final boolean b(o oVar, Object obj, Object obj2) {
        return k.a(f19984a, oVar, d, obj, obj2);
    }

    @Override
    public final boolean c(o oVar, n nVar, n nVar2) {
        return i.a(f19984a, oVar, f19986c, nVar, nVar2);
    }

    @Override
    public final c d(o oVar) {
        c cVar;
        c cVar2 = c.d;
        do {
            cVar = oVar.f19995b;
            if (cVar2 == cVar) {
                break;
            }
        } while (!a(oVar, cVar, cVar2));
        return cVar;
    }

    @Override
    public final n e(o oVar) {
        n nVar;
        n nVar2 = n.f19989c;
        do {
            nVar = oVar.f19996c;
            if (nVar2 == nVar) {
                break;
            }
        } while (!c(oVar, nVar, nVar2));
        return nVar;
    }

    @Override
    public final void f(n nVar, n nVar2) {
        f19984a.putObject(nVar, f19988f, nVar2);
    }

    @Override
    public final void g(n nVar, Thread thread) {
        f19984a.putObject(nVar, f19987e, thread);
    }
}
