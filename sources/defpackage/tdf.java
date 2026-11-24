package defpackage;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;
public final class tdf extends e6f {
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
                unsafe = (Unsafe) AccessController.doPrivileged(new q2((byte) 6));
            }
            try {
                c = unsafe.objectFieldOffset(wdf.class.getDeclaredField("c"));
                b = unsafe.objectFieldOffset(wdf.class.getDeclaredField("b"));
                d = unsafe.objectFieldOffset(wdf.class.getDeclaredField("a"));
                e = unsafe.objectFieldOffset(udf.class.getDeclaredField("a"));
                f = unsafe.objectFieldOffset(udf.class.getDeclaredField("b"));
                a = unsafe;
            } catch (NoSuchFieldException e2) {
                rjb.m(e2);
            } catch (RuntimeException e3) {
                throw e3;
            }
        } catch (PrivilegedActionException e4) {
            rjb.k("Could not initialize intrinsics", e4.getCause());
        }
    }

    @Override
    public final qdf a(wdf wdfVar) {
        qdf qdfVar;
        qdf qdfVar2 = qdf.d;
        do {
            qdfVar = wdfVar.b;
            if (qdfVar2 == qdfVar) {
                break;
            }
        } while (!e(wdfVar, qdfVar, qdfVar2));
        return qdfVar;
    }

    @Override
    public final udf b(wdf wdfVar) {
        udf udfVar;
        udf udfVar2 = udf.c;
        do {
            udfVar = wdfVar.c;
            if (udfVar2 == udfVar) {
                break;
            }
        } while (!g(wdfVar, udfVar, udfVar2));
        return udfVar;
    }

    @Override
    public final void c(udf udfVar, udf udfVar2) {
        a.putObject(udfVar, f, udfVar2);
    }

    @Override
    public final void d(udf udfVar, Thread thread) {
        a.putObject(udfVar, e, thread);
    }

    @Override
    public final boolean e(wdf wdfVar, qdf qdfVar, qdf qdfVar2) {
        return i6f.a(a, wdfVar, b, qdfVar, qdfVar2);
    }

    @Override
    public final boolean f(wdf wdfVar, Object obj, Object obj2) {
        return i6f.a(a, wdfVar, d, obj, obj2);
    }

    @Override
    public final boolean g(wdf wdfVar, udf udfVar, udf udfVar2) {
        return i6f.a(a, wdfVar, c, udfVar, udfVar2);
    }
}
