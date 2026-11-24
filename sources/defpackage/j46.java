package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import sun.misc.Unsafe;
public final class j46 extends fy2 implements pe3 {
    public static final AtomicIntegerFieldUpdater n = AtomicIntegerFieldUpdater.newUpdater(j46.class, "runningWorkers$volatile");
    public static final long r = fy.a.objectFieldOffset(j46.class.getDeclaredField("runningWorkers$volatile"));
    public final pe3 c;
    public final fy2 d;
    public final int e;
    public final qd6 f;
    public final Object h;
    private volatile int runningWorkers$volatile;

    public j46(fy2 fy2Var, int i) {
        pe3 pe3Var;
        if (fy2Var instanceof pe3) {
            pe3Var = (pe3) fy2Var;
        } else {
            pe3Var = null;
        }
        this.c = pe3Var == null ? ub3.a : pe3Var;
        this.d = fy2Var;
        this.e = i;
        this.f = new qd6();
        this.h = new Object();
    }

    @Override
    public final xp3 a(long j, oqb oqbVar, cy2 cy2Var) {
        return this.c.a(j, oqbVar, cy2Var);
    }

    @Override
    public final void b(long j, vb1 vb1Var) {
        this.c.b(j, vb1Var);
    }

    @Override
    public final void c(cy2 cy2Var, Runnable runnable) {
        this.f.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = n;
        Unsafe unsafe = fy.a;
        long j = r;
        if (unsafe.getIntVolatile(this, j) < this.e) {
            synchronized (this.h) {
                if (unsafe.getIntVolatile(this, j) >= this.e) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                Runnable f = f();
                if (f != null) {
                    this.d.c(this, new tnd((Object) this, (Object) f, false, (byte) 6));
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
