package defpackage;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;
public final class s2 extends hpd {
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
                unsafe = (Unsafe) AccessController.doPrivileged(new r2((byte) 0));
            }
            try {
                c = unsafe.objectFieldOffset(u2.class.getDeclaredField("c"));
                b = unsafe.objectFieldOffset(u2.class.getDeclaredField("b"));
                d = unsafe.objectFieldOffset(u2.class.getDeclaredField("a"));
                e = unsafe.objectFieldOffset(t2.class.getDeclaredField("a"));
                f = unsafe.objectFieldOffset(t2.class.getDeclaredField("b"));
                a = unsafe;
            } catch (NoSuchFieldException e2) {
                grb.m(e2);
            }
        } catch (PrivilegedActionException e3) {
            grb.j("Could not initialize intrinsics", e3.getCause());
        }
    }

    @Override
    public final boolean a(u2 u2Var, l2 l2Var, l2 l2Var2) {
        while (true) {
            Unsafe unsafe = a;
            long j = b;
            u2 u2Var2 = u2Var;
            l2 l2Var3 = l2Var;
            l2 l2Var4 = l2Var2;
            if (unsafe.compareAndSwapObject(u2Var2, j, l2Var3, l2Var4)) {
                return true;
            }
            if (unsafe.getObject(u2Var2, j) != l2Var3) {
                return false;
            }
            u2Var = u2Var2;
            l2Var = l2Var3;
            l2Var2 = l2Var4;
        }
    }

    @Override
    public final boolean b(u2 u2Var, Object obj, Object obj2) {
        while (true) {
            Unsafe unsafe = a;
            long j = d;
            u2 u2Var2 = u2Var;
            Object obj3 = obj;
            Object obj4 = obj2;
            if (unsafe.compareAndSwapObject(u2Var2, j, obj3, obj4)) {
                return true;
            }
            if (unsafe.getObject(u2Var2, j) != obj3) {
                return false;
            }
            u2Var = u2Var2;
            obj = obj3;
            obj2 = obj4;
        }
    }

    @Override
    public final boolean c(u2 u2Var, t2 t2Var, t2 t2Var2) {
        while (true) {
            Unsafe unsafe = a;
            long j = c;
            u2 u2Var2 = u2Var;
            t2 t2Var3 = t2Var;
            t2 t2Var4 = t2Var2;
            if (unsafe.compareAndSwapObject(u2Var2, j, t2Var3, t2Var4)) {
                return true;
            }
            if (unsafe.getObject(u2Var2, j) != t2Var3) {
                return false;
            }
            u2Var = u2Var2;
            t2Var = t2Var3;
            t2Var2 = t2Var4;
        }
    }

    @Override
    public final l2 d(u2 u2Var) {
        l2 l2Var;
        l2 l2Var2 = l2.d;
        do {
            l2Var = u2Var.b;
            if (l2Var2 == l2Var) {
                break;
            }
        } while (!a(u2Var, l2Var, l2Var2));
        return l2Var;
    }

    @Override
    public final t2 e(u2 u2Var) {
        t2 t2Var;
        t2 t2Var2 = t2.c;
        do {
            t2Var = u2Var.c;
            if (t2Var2 == t2Var) {
                break;
            }
        } while (!c(u2Var, t2Var, t2Var2));
        return t2Var;
    }

    @Override
    public final void f(t2 t2Var, t2 t2Var2) {
        a.putObject(t2Var, f, t2Var2);
    }

    @Override
    public final void g(t2 t2Var, Thread thread) {
        a.putObject(t2Var, e, thread);
    }
}
