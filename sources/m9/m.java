package m9;

import c8.s9;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;
public final class m extends s9 {
    public static final Unsafe f20968a;
    public static final long f20969b;
    public static final long f20970c;
    public static final long d;
    public static final long f20971e;
    public static final long f20972f;

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
            f20970c = unsafe.objectFieldOffset(o.class.getDeclaredField("c"));
            f20969b = unsafe.objectFieldOffset(o.class.getDeclaredField("b"));
            d = unsafe.objectFieldOffset(o.class.getDeclaredField("a"));
            f20971e = unsafe.objectFieldOffset(n.class.getDeclaredField("a"));
            f20972f = unsafe.objectFieldOffset(n.class.getDeclaredField("b"));
            f20968a = unsafe;
        } catch (NoSuchFieldException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override
    public final boolean a(o oVar, c cVar, c cVar2) {
        return j.a(f20968a, oVar, f20969b, cVar, cVar2);
    }

    @Override
    public final boolean b(o oVar, Object obj, Object obj2) {
        return k.a(f20968a, oVar, d, obj, obj2);
    }

    @Override
    public final boolean c(o oVar, n nVar, n nVar2) {
        return i.a(f20968a, oVar, f20970c, nVar, nVar2);
    }

    @Override
    public final c d(o oVar) {
        c cVar;
        c cVar2 = c.d;
        do {
            cVar = oVar.f20979b;
            if (cVar2 == cVar) {
                break;
            }
        } while (!a(oVar, cVar, cVar2));
        return cVar;
    }

    @Override
    public final n e(o oVar) {
        n nVar;
        n nVar2 = n.f20973c;
        do {
            nVar = oVar.f20980c;
            if (nVar2 == nVar) {
                break;
            }
        } while (!c(oVar, nVar, nVar2));
        return nVar;
    }

    @Override
    public final void f(n nVar, n nVar2) {
        f20968a.putObject(nVar, f20972f, nVar2);
    }

    @Override
    public final void g(n nVar, Thread thread) {
        f20968a.putObject(nVar, f20971e, thread);
    }
}
