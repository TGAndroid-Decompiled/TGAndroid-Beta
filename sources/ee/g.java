package ee;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import zd.d0;
import zd.g0;
import zd.l0;
import zd.x;
import zd.y1;
public final class g extends x implements g0 {
    public static final AtomicIntegerFieldUpdater f10921n = AtomicIntegerFieldUpdater.newUpdater(g.class, "runningWorkers$volatile");
    public final g0 f10922c;
    public final x d;
    public final int f10923e;
    public final k f10924f;
    public final Object h;
    private volatile int runningWorkers$volatile;

    public g(x xVar, int i7) {
        g0 g0Var;
        if (xVar instanceof g0) {
            g0Var = (g0) xVar;
        } else {
            g0Var = null;
        }
        this.f10922c = g0Var == null ? d0.f61963a : g0Var;
        this.d = xVar;
        this.f10923e = i7;
        this.f10924f = new k();
        this.h = new Object();
    }

    @Override
    public final l0 a(long j3, y1 y1Var, id.h hVar) {
        return this.f10922c.a(j3, y1Var, hVar);
    }

    @Override
    public final void b(long j3, zd.m mVar) {
        this.f10922c.b(j3, mVar);
    }

    @Override
    public final void c(id.h hVar, Runnable runnable) {
        this.f10924f.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f10921n;
        if (atomicIntegerFieldUpdater.get(this) < this.f10923e) {
            synchronized (this.h) {
                if (atomicIntegerFieldUpdater.get(this) >= this.f10923e) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                Runnable g10 = g();
                if (g10 != null) {
                    this.d.c(this, new m9.u(this, g10, false, 12));
                }
            }
        }
    }

    public final Runnable g() {
        while (true) {
            Runnable runnable = (Runnable) this.f10924f.d();
            if (runnable == null) {
                synchronized (this.h) {
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f10921n;
                    atomicIntegerFieldUpdater.decrementAndGet(this);
                    if (this.f10924f.c() == 0) {
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
        return this.d + ".limitedParallelism(" + this.f10923e + ')';
    }
}
