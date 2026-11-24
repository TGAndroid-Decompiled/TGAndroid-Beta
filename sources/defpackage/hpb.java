package defpackage;

import sun.misc.Unsafe;
public final class hpb extends ev5 {
    public static final long h = fy.a.objectFieldOffset(hpb.class.getDeclaredField("_state$volatile"));
    private volatile int _state$volatile;
    public final Thread e = Thread.currentThread();
    public xp3 f;

    public static void n(int i) {
        throw new IllegalStateException(("Illegal state " + i).toString());
    }

    @Override
    public final boolean k() {
        return true;
    }

    @Override
    public final void l(Throwable th) {
        while (true) {
            Unsafe unsafe = fy.a;
            long j = h;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile != 0) {
                if (intVolatile != 1 && intVolatile != 2 && intVolatile != 3) {
                    n(intVolatile);
                    throw null;
                }
                return;
            }
            hpb hpbVar = this;
            if (unsafe.compareAndSwapInt(hpbVar, h, intVolatile, 2)) {
                hpbVar.e.interrupt();
                unsafe.putIntVolatile(hpbVar, j, 3);
                return;
            }
            this = hpbVar;
        }
    }

    public final void m() {
        hpb hpbVar;
        while (true) {
            Unsafe unsafe = fy.a;
            long j = h;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile != 0) {
                if (intVolatile != 2) {
                    if (intVolatile == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        n(intVolatile);
                        throw null;
                    }
                }
                hpbVar = this;
            } else {
                hpbVar = this;
                if (unsafe.compareAndSwapInt(hpbVar, j, intVolatile, 1)) {
                    xp3 xp3Var = hpbVar.f;
                    if (xp3Var != null) {
                        xp3Var.dispose();
                        return;
                    }
                    return;
                }
            }
            this = hpbVar;
        }
    }
}
