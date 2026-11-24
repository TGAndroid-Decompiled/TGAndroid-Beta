package defpackage;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;
public final class tjd extends v0f {
    public static final Unsafe a;
    public static final long b;
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new q2((byte) 2));
            }
            try {
                c = unsafe.objectFieldOffset(akd.class.getDeclaredField("c"));
                b = unsafe.objectFieldOffset(akd.class.getDeclaredField("b"));
                d = unsafe.objectFieldOffset(akd.class.getDeclaredField("a"));
                e = unsafe.objectFieldOffset(ujd.class.getDeclaredField("a"));
                f = unsafe.objectFieldOffset(ujd.class.getDeclaredField("b"));
                a = unsafe;
            } catch (NoSuchFieldException e2) {
                sdb.b(e2);
            }
        } catch (PrivilegedActionException e3) {
            fyb.j("Could not initialize intrinsics", e3.getCause());
        }
    }

    @Override
    public final mjd a(tod todVar) {
        mjd mjdVar;
        mjd mjdVar2 = mjd.d;
        do {
            mjdVar = todVar.b;
            if (mjdVar2 == mjdVar) {
                break;
            }
        } while (!e(todVar, mjdVar, mjdVar2));
        return mjdVar;
    }

    @Override
    public final ujd b(tod todVar) {
        ujd ujdVar;
        ujd ujdVar2 = ujd.c;
        do {
            ujdVar = todVar.c;
            if (ujdVar2 == ujdVar) {
                break;
            }
        } while (!g(todVar, ujdVar, ujdVar2));
        return ujdVar;
    }

    @Override
    public final void c(ujd ujdVar, ujd ujdVar2) {
        a.putObject(ujdVar, f, ujdVar2);
    }

    @Override
    public final void d(ujd ujdVar, Thread thread) {
        a.putObject(ujdVar, e, thread);
    }

    @Override
    public final boolean e(tod todVar, mjd mjdVar, mjd mjdVar2) {
        return y0f.a(a, todVar, b, mjdVar, mjdVar2);
    }

    @Override
    public final boolean f(akd akdVar, Object obj, Object obj2) {
        return y0f.a(a, akdVar, d, obj, obj2);
    }

    @Override
    public final boolean g(akd akdVar, ujd ujdVar, ujd ujdVar2) {
        return y0f.a(a, akdVar, c, ujdVar, ujdVar2);
    }
}
