package defpackage;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;
public final class vld extends x2f {
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
                c = unsafe.objectFieldOffset(cmd.class.getDeclaredField("c"));
                b = unsafe.objectFieldOffset(cmd.class.getDeclaredField("b"));
                d = unsafe.objectFieldOffset(cmd.class.getDeclaredField("a"));
                e = unsafe.objectFieldOffset(wld.class.getDeclaredField("a"));
                f = unsafe.objectFieldOffset(wld.class.getDeclaredField("b"));
                a = unsafe;
            } catch (NoSuchFieldException e2) {
                rjb.m(e2);
            }
        } catch (PrivilegedActionException e3) {
            rjb.k("Could not initialize intrinsics", e3.getCause());
        }
    }

    @Override
    public final old a(wqd wqdVar) {
        old oldVar;
        old oldVar2 = old.d;
        do {
            oldVar = wqdVar.b;
            if (oldVar2 == oldVar) {
                break;
            }
        } while (!e(wqdVar, oldVar, oldVar2));
        return oldVar;
    }

    @Override
    public final wld b(wqd wqdVar) {
        wld wldVar;
        wld wldVar2 = wld.c;
        do {
            wldVar = wqdVar.c;
            if (wldVar2 == wldVar) {
                break;
            }
        } while (!g(wqdVar, wldVar, wldVar2));
        return wldVar;
    }

    @Override
    public final void c(wld wldVar, wld wldVar2) {
        a.putObject(wldVar, f, wldVar2);
    }

    @Override
    public final void d(wld wldVar, Thread thread) {
        a.putObject(wldVar, e, thread);
    }

    @Override
    public final boolean e(wqd wqdVar, old oldVar, old oldVar2) {
        return a3f.a(a, wqdVar, b, oldVar, oldVar2);
    }

    @Override
    public final boolean f(cmd cmdVar, Object obj, Object obj2) {
        return a3f.a(a, cmdVar, d, obj, obj2);
    }

    @Override
    public final boolean g(cmd cmdVar, wld wldVar, wld wldVar2) {
        return a3f.a(a, cmdVar, c, wldVar, wldVar2);
    }
}
