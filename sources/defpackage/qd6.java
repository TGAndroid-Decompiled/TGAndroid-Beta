package defpackage;

import sun.misc.Unsafe;
public class qd6 {
    public static final long a = fy.a.objectFieldOffset(qd6.class.getDeclaredField("_cur$volatile"));
    private volatile Object _cur$volatile = new sd6(8, false);

    public final boolean a(Runnable runnable) {
        qd6 qd6Var;
        while (true) {
            Unsafe unsafe = fy.a;
            long j = a;
            sd6 sd6Var = (sd6) unsafe.getObjectVolatile(this, j);
            int a2 = sd6Var.a(runnable);
            if (a2 == 0) {
                return true;
            }
            if (a2 != 1) {
                if (a2 != 2) {
                    qd6Var = this;
                } else {
                    return false;
                }
            } else {
                sd6 c = sd6Var.c();
                while (true) {
                    Unsafe unsafe2 = fy.a;
                    qd6Var = this;
                    if (!unsafe2.compareAndSwapObject(qd6Var, a, sd6Var, c) && unsafe2.getObjectVolatile(qd6Var, j) == sd6Var) {
                        this = qd6Var;
                    }
                }
            }
            this = qd6Var;
        }
    }

    public final void b() {
        qd6 qd6Var;
        while (true) {
            Unsafe unsafe = fy.a;
            long j = a;
            sd6 sd6Var = (sd6) unsafe.getObjectVolatile(this, j);
            if (sd6Var.b()) {
                return;
            }
            sd6 c = sd6Var.c();
            while (true) {
                qd6Var = this;
                if (!fy.a.compareAndSwapObject(qd6Var, a, sd6Var, c) && fy.a.getObjectVolatile(qd6Var, j) == sd6Var) {
                    this = qd6Var;
                }
            }
            this = qd6Var;
        }
    }

    public final int c() {
        sd6 sd6Var = (sd6) fy.a.getObjectVolatile(this, a);
        sd6Var.getClass();
        long longVolatile = fy.a.getLongVolatile(sd6Var, sd6.g);
        return (((int) ((longVolatile & 1152921503533105152L) >> 30)) - ((int) (1073741823 & longVolatile))) & 1073741823;
    }

    public final Object d() {
        qd6 qd6Var;
        while (true) {
            Unsafe unsafe = fy.a;
            long j = a;
            sd6 sd6Var = (sd6) unsafe.getObjectVolatile(this, j);
            Object d = sd6Var.d();
            if (d != sd6.e) {
                return d;
            }
            sd6 c = sd6Var.c();
            while (true) {
                qd6Var = this;
                if (!fy.a.compareAndSwapObject(qd6Var, a, sd6Var, c) && fy.a.getObjectVolatile(qd6Var, j) == sd6Var) {
                    this = qd6Var;
                }
            }
            this = qd6Var;
        }
    }
}
