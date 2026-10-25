package k9;

import a8.pd;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;
public final class m extends pd {
    public static final Unsafe f16478a;
    public static final long f16479b;
    public static final long f16480c;
    public static final long d;
    public static final long e;
    public static final long f16481f;

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
            f16480c = unsafe.objectFieldOffset(o.class.getDeclaredField("c"));
            f16479b = unsafe.objectFieldOffset(o.class.getDeclaredField("b"));
            d = unsafe.objectFieldOffset(o.class.getDeclaredField("a"));
            e = unsafe.objectFieldOffset(n.class.getDeclaredField("a"));
            f16481f = unsafe.objectFieldOffset(n.class.getDeclaredField("b"));
            f16478a = unsafe;
        } catch (NoSuchFieldException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override
    public final boolean a(o oVar, c cVar, c cVar2) {
        return j.a(f16478a, oVar, f16479b, cVar, cVar2);
    }

    @Override
    public final boolean b(o oVar, Object obj, Object obj2) {
        return k.a(f16478a, oVar, d, obj, obj2);
    }

    @Override
    public final boolean c(o oVar, n nVar, n nVar2) {
        return i.a(f16478a, oVar, f16480c, nVar, nVar2);
    }

    @Override
    public final c d(o oVar) {
        c cVar;
        c cVar2 = c.d;
        do {
            cVar = oVar.f16487b;
            if (cVar2 == cVar) {
                break;
            }
        } while (!a(oVar, cVar, cVar2));
        return cVar;
    }

    @Override
    public final n e(o oVar) {
        n nVar;
        n nVar2 = n.f16482c;
        do {
            nVar = oVar.f16488c;
            if (nVar2 == nVar) {
                break;
            }
        } while (!c(oVar, nVar, nVar2));
        return nVar;
    }

    @Override
    public final void f(n nVar, n nVar2) {
        f16478a.putObject(nVar, f16481f, nVar2);
    }

    @Override
    public final void g(n nVar, Thread thread) {
        f16478a.putObject(nVar, e, thread);
    }
}
