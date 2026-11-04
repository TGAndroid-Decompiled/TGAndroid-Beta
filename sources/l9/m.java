package l9;

import b8.xd;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;
public final class m extends xd {
    public static final Unsafe f18147a;
    public static final long f18148b;
    public static final long f18149c;
    public static final long d;
    public static final long f18150e;
    public static final long f18151f;

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
            f18149c = unsafe.objectFieldOffset(o.class.getDeclaredField("c"));
            f18148b = unsafe.objectFieldOffset(o.class.getDeclaredField("b"));
            d = unsafe.objectFieldOffset(o.class.getDeclaredField("a"));
            f18150e = unsafe.objectFieldOffset(n.class.getDeclaredField("a"));
            f18151f = unsafe.objectFieldOffset(n.class.getDeclaredField("b"));
            f18147a = unsafe;
        } catch (NoSuchFieldException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override
    public final boolean a(o oVar, c cVar, c cVar2) {
        return j.a(f18147a, oVar, f18148b, cVar, cVar2);
    }

    @Override
    public final boolean b(o oVar, Object obj, Object obj2) {
        return k.a(f18147a, oVar, d, obj, obj2);
    }

    @Override
    public final boolean c(o oVar, n nVar, n nVar2) {
        return i.a(f18147a, oVar, f18149c, nVar, nVar2);
    }

    @Override
    public final c d(o oVar) {
        c cVar;
        c cVar2 = c.d;
        do {
            cVar = oVar.f18158b;
            if (cVar2 == cVar) {
                break;
            }
        } while (!a(oVar, cVar, cVar2));
        return cVar;
    }

    @Override
    public final n e(o oVar) {
        n nVar;
        n nVar2 = n.f18152c;
        do {
            nVar = oVar.f18159c;
            if (nVar2 == nVar) {
                break;
            }
        } while (!c(oVar, nVar, nVar2));
        return nVar;
    }

    @Override
    public final void f(n nVar, n nVar2) {
        f18147a.putObject(nVar, f18151f, nVar2);
    }

    @Override
    public final void g(n nVar, Thread thread) {
        f18147a.putObject(nVar, f18150e, thread);
    }
}
