package fe;

import ae.b0;
import ae.g2;
import ae.i0;
import ae.l0;
import ae.q0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
public final class i extends b0 implements l0 {
    public static final AtomicIntegerFieldUpdater f9897n = AtomicIntegerFieldUpdater.newUpdater(i.class, "runningWorkers$volatile");
    public final b0 f9898c;
    public final int d;
    public final l0 f9899e;
    public final l f9900f;
    public final Object h;
    private volatile int runningWorkers$volatile;

    public i(b0 b0Var, int i10) {
        l0 l0Var;
        this.f9898c = b0Var;
        this.d = i10;
        if (b0Var instanceof l0) {
            l0Var = (l0) b0Var;
        } else {
            l0Var = null;
        }
        this.f9899e = l0Var == null ? i0.f465a : l0Var;
        this.f9900f = new l();
        this.h = new Object();
    }

    @Override
    public final q0 a(long j3, g2 g2Var, jd.h hVar) {
        return this.f9899e.a(j3, g2Var, hVar);
    }

    @Override
    public final void b(long j3, ae.m mVar) {
        this.f9899e.b(j3, mVar);
    }

    @Override
    public final void c(jd.h hVar, Runnable runnable) {
        this.f9900f.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f9897n;
        if (atomicIntegerFieldUpdater.get(this) < this.d) {
            synchronized (this.h) {
                if (atomicIntegerFieldUpdater.get(this) >= this.d) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                Runnable f7 = f();
                if (f7 != null) {
                    this.f9898c.c(this, new i9.s(this, f7, false, 14));
                }
            }
        }
    }

    public final Runnable f() {
        while (true) {
            Runnable runnable = (Runnable) this.f9900f.d();
            if (runnable == null) {
                synchronized (this.h) {
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f9897n;
                    atomicIntegerFieldUpdater.decrementAndGet(this);
                    if (this.f9900f.c() == 0) {
                        return null;
                    }
                    atomicIntegerFieldUpdater.incrementAndGet(this);
                }
            } else {
                return runnable;
            }
        }
    }
}
