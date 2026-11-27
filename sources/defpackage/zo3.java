package defpackage;

import sun.misc.Unsafe;
public final class zo3 extends ju9 {
    public static final long f = fx.a.objectFieldOffset(zo3.class.getDeclaredField("_decision$volatile"));
    private volatile int _decision$volatile;

    @Override
    public final void f(Object obj) {
        g(obj);
    }

    @Override
    public final void g(Object obj) {
        while (true) {
            Unsafe unsafe = fx.a;
            long j = f;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile != 0) {
                if (intVolatile == 1) {
                    q7c.c(xpe.a(this.e), pxd.a(obj));
                    return;
                } else {
                    grb.i("Already resumed");
                    return;
                }
            }
            zo3 zo3Var = this;
            if (unsafe.compareAndSwapInt(zo3Var, j, 0, 2)) {
                return;
            }
            this = zo3Var;
        }
    }
}
