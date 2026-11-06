package ee;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import zd.d0;
import zd.g0;
import zd.l0;
import zd.x;
import zd.y1;
public final class g extends x implements g0 {
    public static final AtomicIntegerFieldUpdater f10777n = AtomicIntegerFieldUpdater.newUpdater(g.class, "runningWorkers$volatile");
    public final g0 f10778c;
    public final x d;
    public final int f10779e;
    public final k f10780f;
    public final Object h;
    private volatile int runningWorkers$volatile;

    public g(x xVar, int i7) {
        g0 g0Var;
        if (xVar instanceof g0) {
            g0Var = (g0) xVar;
        } else {
            g0Var = null;
        }
        this.f10778c = g0Var == null ? d0.f59937a : g0Var;
        this.d = xVar;
        this.f10779e = i7;
        this.f10780f = new k();
        this.h = new Object();
    }

    @Override
    public final l0 a(long j3, y1 y1Var, id.h hVar) {
        return this.f10778c.a(j3, y1Var, hVar);
    }

    @Override
    public final void b(long j3, zd.m mVar) {
        this.f10778c.b(j3, mVar);
    }

    @Override
    public final void c(id.h hVar, Runnable runnable) {
        this.f10780f.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f10777n;
        if (atomicIntegerFieldUpdater.get(this) < this.f10779e) {
            synchronized (this.h) {
                if (atomicIntegerFieldUpdater.get(this) >= this.f10779e) {
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
            Runnable runnable = (Runnable) this.f10780f.d();
            if (runnable == null) {
                synchronized (this.h) {
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f10777n;
                    atomicIntegerFieldUpdater.decrementAndGet(this);
                    if (this.f10780f.c() == 0) {
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
        return this.d + ".limitedParallelism(" + this.f10779e + ')';
    }
}
