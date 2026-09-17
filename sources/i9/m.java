package i9;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;
import v7.k8;
public final class m extends k8 {
    public static final Unsafe f11907a;
    public static final long f11908b;
    public static final long f11909c;
    public static final long d;
    public static final long f11910e;
    public static final long f11911f;

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
            f11909c = unsafe.objectFieldOffset(o.class.getDeclaredField("c"));
            f11908b = unsafe.objectFieldOffset(o.class.getDeclaredField("b"));
            d = unsafe.objectFieldOffset(o.class.getDeclaredField("a"));
            f11910e = unsafe.objectFieldOffset(n.class.getDeclaredField("a"));
            f11911f = unsafe.objectFieldOffset(n.class.getDeclaredField("b"));
            f11907a = unsafe;
        } catch (NoSuchFieldException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override
    public final boolean a(o oVar, c cVar, c cVar2) {
        return j.a(f11907a, oVar, f11908b, cVar, cVar2);
    }

    @Override
    public final boolean b(o oVar, Object obj, Object obj2) {
        return k.a(f11907a, oVar, d, obj, obj2);
    }

    @Override
    public final boolean c(o oVar, n nVar, n nVar2) {
        return i.a(f11907a, oVar, f11909c, nVar, nVar2);
    }

    @Override
    public final c d(o oVar) {
        c cVar;
        c cVar2 = c.d;
        do {
            cVar = oVar.f11918b;
            if (cVar2 == cVar) {
                break;
            }
        } while (!a(oVar, cVar, cVar2));
        return cVar;
    }

    @Override
    public final n e(o oVar) {
        n nVar;
        n nVar2 = n.f11912c;
        do {
            nVar = oVar.f11919c;
            if (nVar2 == nVar) {
                break;
            }
        } while (!c(oVar, nVar, nVar2));
        return nVar;
    }

    @Override
    public final void f(n nVar, n nVar2) {
        f11907a.putObject(nVar, f11911f, nVar2);
    }

    @Override
    public final void g(n nVar, Thread thread) {
        f11907a.putObject(nVar, f11910e, thread);
    }
}
