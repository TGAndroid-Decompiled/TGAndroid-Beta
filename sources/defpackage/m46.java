package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import sun.misc.Unsafe;
public final class m46 extends px2 implements vd3 {
    public static final AtomicIntegerFieldUpdater n = AtomicIntegerFieldUpdater.newUpdater(m46.class, "runningWorkers$volatile");
    public static final long r = fx.a.objectFieldOffset(m46.class.getDeclaredField("runningWorkers$volatile"));
    public final vd3 c;
    public final px2 d;
    public final int e;
    public final vd6 f;
    public final Object h;
    private volatile int runningWorkers$volatile;

    public m46(px2 px2Var, int i) {
        vd3 vd3Var;
        if (px2Var instanceof vd3) {
            vd3Var = (vd3) px2Var;
        } else {
            vd3Var = null;
        }
        this.c = vd3Var == null ? bb3.a : vd3Var;
        this.d = px2Var;
        this.e = i;
        this.f = new vd6();
        this.h = new Object();
    }

    @Override
    public final ep3 a(long j, nsb nsbVar, mx2 mx2Var) {
        return this.c.a(j, nsbVar, mx2Var);
    }

    @Override
    public final void b(long j, va1 va1Var) {
        this.c.b(j, va1Var);
    }

    @Override
    public final void c(mx2 mx2Var, Runnable runnable) {
        this.f.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = n;
        Unsafe unsafe = fx.a;
        long j = r;
        if (unsafe.getIntVolatile(this, j) < this.e) {
            synchronized (this.h) {
                if (unsafe.getIntVolatile(this, j) >= this.e) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                Runnable f = f();
                if (f != null) {
                    this.d.c(this, new iqd((Object) this, (Object) f, false, (byte) 6));
                }
            }
        }
    }

    public final Runnable f() {
        while (true) {
            Runnable runnable = (Runnable) this.f.d();
            if (runnable == null) {
                synchronized (this.h) {
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = n;
                    atomicIntegerFieldUpdater.decrementAndGet(this);
                    if (this.f.c() == 0) {
                        return null;
                    }
                    atomicIntegerFieldUpdater.incrementAndGet(this);
                }
            } else {
                return runnable;
            }
        }
    }

    @Override
    public final String toString() {
        return this.d + ".limitedParallelism(" + this.e + ')';
    }
}
