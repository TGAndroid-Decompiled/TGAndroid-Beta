package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import sun.misc.Unsafe;
public abstract class hz9 extends nr2 implements sm7 {
    public static final AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(hz9.class, "cleanedAndPointers$volatile");
    public static final long f = fx.a.objectFieldOffset(hz9.class.getDeclaredField("cleanedAndPointers$volatile"));
    private volatile int cleanedAndPointers$volatile;
    public final long d;

    public hz9(long j, hz9 hz9Var, int i) {
        super(hz9Var);
        this.d = j;
        this.cleanedAndPointers$volatile = i << 16;
    }

    @Override
    public final boolean d() {
        if (fx.a.getIntVolatile(this, f) == g() && c() != null) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        if (e.addAndGet(this, -65536) == g() && c() != null) {
            return true;
        }
        return false;
    }

    public abstract int g();

    public abstract void h(int i, mx2 mx2Var);

    public final void i() {
        if (e.incrementAndGet(this) == g()) {
            e();
        }
    }

    public final boolean j() {
        while (true) {
            Unsafe unsafe = fx.a;
            long j = f;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile == this.g() && this.c() != null) {
                return false;
            }
            hz9 hz9Var = this;
            if (unsafe.compareAndSwapInt(hz9Var, j, intVolatile, intVolatile + 65536)) {
                return true;
            }
            this = hz9Var;
        }
    }
}
