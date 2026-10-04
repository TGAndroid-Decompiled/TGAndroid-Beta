package i9;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;
import v7.k8;
public final class m extends k8 {
    public static final Unsafe f12012a;
    public static final long f12013b;
    public static final long f12014c;
    public static final long d;
    public static final long f12015e;
    public static final long f12016f;

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
            f12014c = unsafe.objectFieldOffset(o.class.getDeclaredField("c"));
            f12013b = unsafe.objectFieldOffset(o.class.getDeclaredField("b"));
            d = unsafe.objectFieldOffset(o.class.getDeclaredField("a"));
            f12015e = unsafe.objectFieldOffset(n.class.getDeclaredField("a"));
            f12016f = unsafe.objectFieldOffset(n.class.getDeclaredField("b"));
            f12012a = unsafe;
        } catch (NoSuchFieldException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override
    public final boolean a(o oVar, c cVar, c cVar2) {
        return j.a(f12012a, oVar, f12013b, cVar, cVar2);
    }

    @Override
    public final boolean b(o oVar, Object obj, Object obj2) {
        return k.a(f12012a, oVar, d, obj, obj2);
    }

    @Override
    public final boolean c(o oVar, n nVar, n nVar2) {
        return i.a(f12012a, oVar, f12014c, nVar, nVar2);
    }

    @Override
    public final c d(o oVar) {
        c cVar;
        c cVar2 = c.d;
        do {
            cVar = oVar.f12023b;
            if (cVar2 == cVar) {
                break;
            }
        } while (!a(oVar, cVar, cVar2));
        return cVar;
    }

    @Override
    public final n e(o oVar) {
        n nVar;
        n nVar2 = n.f12017c;
        do {
            nVar = oVar.f12024c;
            if (nVar2 == nVar) {
                break;
            }
        } while (!c(oVar, nVar, nVar2));
        return nVar;
    }

    @Override
    public final void f(n nVar, n nVar2) {
        f12012a.putObject(nVar, f12016f, nVar2);
    }

    @Override
    public final void g(n nVar, Thread thread) {
        f12012a.putObject(nVar, f12015e, thread);
    }
}
