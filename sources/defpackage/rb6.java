package defpackage;

import sun.misc.Unsafe;
public class rb6 {
    public static final long a = ex.a.objectFieldOffset(rb6.class.getDeclaredField("_cur$volatile"));
    private volatile Object _cur$volatile = new tb6(8, false);

    public final boolean a(Runnable runnable) {
        rb6 rb6Var;
        while (true) {
            Unsafe unsafe = ex.a;
            long j = a;
            tb6 tb6Var = (tb6) unsafe.getObjectVolatile(this, j);
            int a2 = tb6Var.a(runnable);
            if (a2 == 0) {
                return true;
            }
            if (a2 != 1) {
                if (a2 != 2) {
                    rb6Var = this;
                } else {
                    return false;
                }
            } else {
                tb6 c = tb6Var.c();
                while (true) {
                    Unsafe unsafe2 = ex.a;
                    rb6Var = this;
                    if (!unsafe2.compareAndSwapObject(rb6Var, a, tb6Var, c) && unsafe2.getObjectVolatile(rb6Var, j) == tb6Var) {
                        this = rb6Var;
                    }
                }
            }
            this = rb6Var;
        }
    }

    public final void b() {
        rb6 rb6Var;
        while (true) {
            Unsafe unsafe = ex.a;
            long j = a;
            tb6 tb6Var = (tb6) unsafe.getObjectVolatile(this, j);
            if (tb6Var.b()) {
                return;
            }
            tb6 c = tb6Var.c();
            while (true) {
                rb6Var = this;
                if (!ex.a.compareAndSwapObject(rb6Var, a, tb6Var, c) && ex.a.getObjectVolatile(rb6Var, j) == tb6Var) {
                    this = rb6Var;
                }
            }
            this = rb6Var;
        }
    }

    public final int c() {
        tb6 tb6Var = (tb6) ex.a.getObjectVolatile(this, a);
        tb6Var.getClass();
        long longVolatile = ex.a.getLongVolatile(tb6Var, tb6.g);
        return (((int) ((longVolatile & 1152921503533105152L) >> 30)) - ((int) (1073741823 & longVolatile))) & 1073741823;
    }

    public final Object d() {
        rb6 rb6Var;
        while (true) {
            Unsafe unsafe = ex.a;
            long j = a;
            tb6 tb6Var = (tb6) unsafe.getObjectVolatile(this, j);
            Object d = tb6Var.d();
            if (d != tb6.e) {
                return d;
            }
            tb6 c = tb6Var.c();
            while (true) {
                rb6Var = this;
                if (!ex.a.compareAndSwapObject(rb6Var, a, tb6Var, c) && ex.a.getObjectVolatile(rb6Var, j) == tb6Var) {
                    this = rb6Var;
                }
            }
            this = rb6Var;
        }
    }
}
