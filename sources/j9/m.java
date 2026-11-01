package j9;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;
import v7.o8;
public final class m extends o8 {
    public static final Unsafe f9751a;
    public static final long f9752b;
    public static final long f9753c;
    public static final long d;
    public static final long e;
    public static final long f9754f;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (PrivilegedActionException e7) {
                throw new RuntimeException("Could not initialize intrinsics", e7.getCause());
            }
        } catch (SecurityException unused) {
            unsafe = (Unsafe) AccessController.doPrivileged((PrivilegedExceptionAction<Object>) new Object());
        }
        try {
            f9753c = unsafe.objectFieldOffset(o.class.getDeclaredField("c"));
            f9752b = unsafe.objectFieldOffset(o.class.getDeclaredField("b"));
            d = unsafe.objectFieldOffset(o.class.getDeclaredField("a"));
            e = unsafe.objectFieldOffset(n.class.getDeclaredField("a"));
            f9754f = unsafe.objectFieldOffset(n.class.getDeclaredField("b"));
            f9751a = unsafe;
        } catch (NoSuchFieldException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override
    public final boolean a(o oVar, c cVar, c cVar2) {
        return j.a(f9751a, oVar, f9752b, cVar, cVar2);
    }

    @Override
    public final boolean b(o oVar, Object obj, Object obj2) {
        return k.a(f9751a, oVar, d, obj, obj2);
    }

    @Override
    public final boolean c(o oVar, n nVar, n nVar2) {
        return i.a(f9751a, oVar, f9753c, nVar, nVar2);
    }

    @Override
    public final c d(o oVar) {
        c cVar;
        c cVar2 = c.d;
        do {
            cVar = oVar.f9760b;
            if (cVar2 == cVar) {
                break;
            }
        } while (!a(oVar, cVar, cVar2));
        return cVar;
    }

    @Override
    public final n e(o oVar) {
        n nVar;
        n nVar2 = n.f9755c;
        do {
            nVar = oVar.f9761c;
            if (nVar2 == nVar) {
                break;
            }
        } while (!c(oVar, nVar, nVar2));
        return nVar;
    }

    @Override
    public final void f(n nVar, n nVar2) {
        f9751a.putObject(nVar, f9754f, nVar2);
    }

    @Override
    public final void g(n nVar, Thread thread) {
        f9751a.putObject(nVar, e, thread);
    }
}
