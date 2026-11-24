package defpackage;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;
public final class r2 extends smd {
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
                unsafe = (Unsafe) AccessController.doPrivileged(new q2((byte) 0));
            }
            try {
                c = unsafe.objectFieldOffset(t2.class.getDeclaredField("c"));
                b = unsafe.objectFieldOffset(t2.class.getDeclaredField("b"));
                d = unsafe.objectFieldOffset(t2.class.getDeclaredField("a"));
                e = unsafe.objectFieldOffset(s2.class.getDeclaredField("a"));
                f = unsafe.objectFieldOffset(s2.class.getDeclaredField("b"));
                a = unsafe;
            } catch (NoSuchFieldException e2) {
                rjb.m(e2);
            }
        } catch (PrivilegedActionException e3) {
            rjb.k("Could not initialize intrinsics", e3.getCause());
        }
    }

    @Override
    public final boolean a(t2 t2Var, k2 k2Var, k2 k2Var2) {
        while (true) {
            Unsafe unsafe = a;
            long j = b;
            t2 t2Var2 = t2Var;
            k2 k2Var3 = k2Var;
            k2 k2Var4 = k2Var2;
            if (unsafe.compareAndSwapObject(t2Var2, j, k2Var3, k2Var4)) {
                return true;
            }
            if (unsafe.getObject(t2Var2, j) != k2Var3) {
                return false;
            }
            t2Var = t2Var2;
            k2Var = k2Var3;
            k2Var2 = k2Var4;
        }
    }

    @Override
    public final boolean b(t2 t2Var, Object obj, Object obj2) {
        while (true) {
            Unsafe unsafe = a;
            long j = d;
            t2 t2Var2 = t2Var;
            Object obj3 = obj;
            Object obj4 = obj2;
            if (unsafe.compareAndSwapObject(t2Var2, j, obj3, obj4)) {
                return true;
            }
            if (unsafe.getObject(t2Var2, j) != obj3) {
                return false;
            }
            t2Var = t2Var2;
            obj = obj3;
            obj2 = obj4;
        }
    }

    @Override
    public final boolean c(t2 t2Var, s2 s2Var, s2 s2Var2) {
        while (true) {
            Unsafe unsafe = a;
            long j = c;
            t2 t2Var2 = t2Var;
            s2 s2Var3 = s2Var;
            s2 s2Var4 = s2Var2;
            if (unsafe.compareAndSwapObject(t2Var2, j, s2Var3, s2Var4)) {
                return true;
            }
            if (unsafe.getObject(t2Var2, j) != s2Var3) {
                return false;
            }
            t2Var = t2Var2;
            s2Var = s2Var3;
            s2Var2 = s2Var4;
        }
    }

    @Override
    public final k2 d(t2 t2Var) {
        k2 k2Var;
        k2 k2Var2 = k2.d;
        do {
            k2Var = t2Var.b;
            if (k2Var2 == k2Var) {
                break;
            }
        } while (!a(t2Var, k2Var, k2Var2));
        return k2Var;
    }

    @Override
    public final s2 e(t2 t2Var) {
        s2 s2Var;
        s2 s2Var2 = s2.c;
        do {
            s2Var = t2Var.c;
            if (s2Var2 == s2Var) {
                break;
            }
        } while (!c(t2Var, s2Var, s2Var2));
        return s2Var;
    }

    @Override
    public final void f(s2 s2Var, s2 s2Var2) {
        a.putObject(s2Var, f, s2Var2);
    }

    @Override
    public final void g(s2 s2Var, Thread thread) {
        a.putObject(s2Var, e, thread);
    }
}
