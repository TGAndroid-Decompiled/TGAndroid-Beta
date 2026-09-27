package ee;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import zd.a0;
import zd.e2;
import zd.g0;
import zd.j0;
import zd.o0;
public final class i extends a0 implements j0 {
    public static final AtomicIntegerFieldUpdater f8168n = AtomicIntegerFieldUpdater.newUpdater(i.class, "runningWorkers$volatile");
    public final a0 f8169c;
    public final int d;
    public final j0 e;
    public final l f8170f;
    public final Object h;
    private volatile int runningWorkers$volatile;

    public i(a0 a0Var, int i10) {
        j0 j0Var;
        this.f8169c = a0Var;
        this.d = i10;
        if (a0Var instanceof j0) {
            j0Var = (j0) a0Var;
        } else {
            j0Var = null;
        }
        this.e = j0Var == null ? g0.f49213a : j0Var;
        this.f8170f = new l();
        this.h = new Object();
    }

    @Override
    public final o0 a(long j3, e2 e2Var, id.h hVar) {
        return this.e.a(j3, e2Var, hVar);
    }

    @Override
    public final void b(long j3, zd.m mVar) {
        this.e.b(j3, mVar);
    }

    @Override
    public final void c(id.h hVar, Runnable runnable) {
        this.f8170f.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f8168n;
        if (atomicIntegerFieldUpdater.get(this) < this.d) {
            synchronized (this.h) {
                if (atomicIntegerFieldUpdater.get(this) >= this.d) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                Runnable f7 = f();
                if (f7 != null) {
                    this.f8169c.c(this, new i9.s(this, f7, false, 13));
                }
            }
        }
    }

    public final Runnable f() {
        while (true) {
            Runnable runnable = (Runnable) this.f8170f.d();
            if (runnable == null) {
                synchronized (this.h) {
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f8168n;
                    atomicIntegerFieldUpdater.decrementAndGet(this);
                    if (this.f8170f.c() == 0) {
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
