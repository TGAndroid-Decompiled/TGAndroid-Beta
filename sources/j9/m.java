package j9;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;
import v7.p8;
public final class m extends p8 {
    public static final Unsafe f14343a;
    public static final long f14344b;
    public static final long f14345c;
    public static final long d;
    public static final long e;
    public static final long f14346f;

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
            f14345c = unsafe.objectFieldOffset(o.class.getDeclaredField("c"));
            f14344b = unsafe.objectFieldOffset(o.class.getDeclaredField("b"));
            d = unsafe.objectFieldOffset(o.class.getDeclaredField("a"));
            e = unsafe.objectFieldOffset(n.class.getDeclaredField("a"));
            f14346f = unsafe.objectFieldOffset(n.class.getDeclaredField("b"));
            f14343a = unsafe;
        } catch (NoSuchFieldException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override
    public final boolean a(o oVar, c cVar, c cVar2) {
        return j.a(f14343a, oVar, f14344b, cVar, cVar2);
    }

    @Override
    public final boolean b(j9.o r7, java.lang.Object r8, java.lang.Object r9) {
        throw new UnsupportedOperationException("Method not decompiled: j9.m.b(j9.o, java.lang.Object, java.lang.Object):boolean");
    }

    @Override
    public final boolean c(o oVar, n nVar, n nVar2) {
        return i.a(f14343a, oVar, f14345c, nVar, nVar2);
    }

    @Override
    public final c d(o oVar) {
        c cVar;
        c cVar2 = c.d;
        do {
            cVar = oVar.f14352b;
            if (cVar2 == cVar) {
                break;
            }
        } while (!a(oVar, cVar, cVar2));
        return cVar;
    }

    @Override
    public final n e(o oVar) {
        n nVar;
        n nVar2 = n.f14347c;
        do {
            nVar = oVar.f14353c;
            if (nVar2 == nVar) {
                break;
            }
        } while (!c(oVar, nVar, nVar2));
        return nVar;
    }

    @Override
    public final void f(n nVar, n nVar2) {
        f14343a.putObject(nVar, f14346f, nVar2);
    }

    @Override
    public final void g(n nVar, Thread thread) {
        f14343a.putObject(nVar, e, thread);
    }
}
