package defpackage;

import sun.misc.Unsafe;
public class vd6 {
    public static final long a = fx.a.objectFieldOffset(vd6.class.getDeclaredField("_cur$volatile"));
    private volatile Object _cur$volatile = new xd6(8, false);

    public final boolean a(Runnable runnable) {
        vd6 vd6Var;
        while (true) {
            Unsafe unsafe = fx.a;
            long j = a;
            xd6 xd6Var = (xd6) unsafe.getObjectVolatile(this, j);
            int a2 = xd6Var.a(runnable);
            if (a2 == 0) {
                return true;
            }
            if (a2 != 1) {
                if (a2 != 2) {
                    vd6Var = this;
                } else {
                    return false;
                }
            } else {
                xd6 c = xd6Var.c();
                while (true) {
                    Unsafe unsafe2 = fx.a;
                    vd6Var = this;
                    if (!unsafe2.compareAndSwapObject(vd6Var, a, xd6Var, c) && unsafe2.getObjectVolatile(vd6Var, j) == xd6Var) {
                        this = vd6Var;
                    }
                }
            }
            this = vd6Var;
        }
    }

    public final void b() {
        vd6 vd6Var;
        while (true) {
            Unsafe unsafe = fx.a;
            long j = a;
            xd6 xd6Var = (xd6) unsafe.getObjectVolatile(this, j);
            if (xd6Var.b()) {
                return;
            }
            xd6 c = xd6Var.c();
            while (true) {
                vd6Var = this;
                if (!fx.a.compareAndSwapObject(vd6Var, a, xd6Var, c) && fx.a.getObjectVolatile(vd6Var, j) == xd6Var) {
                    this = vd6Var;
                }
            }
            this = vd6Var;
        }
    }

    public final int c() {
        xd6 xd6Var = (xd6) fx.a.getObjectVolatile(this, a);
        xd6Var.getClass();
        long longVolatile = fx.a.getLongVolatile(xd6Var, xd6.g);
        return (((int) ((longVolatile & 1152921503533105152L) >> 30)) - ((int) (1073741823 & longVolatile))) & 1073741823;
    }

    public final Object d() {
        vd6 vd6Var;
        while (true) {
            Unsafe unsafe = fx.a;
            long j = a;
            xd6 xd6Var = (xd6) unsafe.getObjectVolatile(this, j);
            Object d = xd6Var.d();
            if (d != xd6.e) {
                return d;
            }
            xd6 c = xd6Var.c();
            while (true) {
                vd6Var = this;
                if (!fx.a.compareAndSwapObject(vd6Var, a, xd6Var, c) && fx.a.getObjectVolatile(vd6Var, j) == xd6Var) {
                    this = vd6Var;
                }
            }
            this = vd6Var;
        }
    }
}
