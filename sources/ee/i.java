package ee;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import zd.a0;
import zd.e2;
import zd.g0;
import zd.j0;
import zd.o0;
public final class i extends a0 implements j0 {
    public static final AtomicIntegerFieldUpdater f9103n = AtomicIntegerFieldUpdater.newUpdater(i.class, "runningWorkers$volatile");
    public final a0 f9104c;
    public final int d;
    public final j0 f9105e;
    public final l f9106f;
    public final Object h;
    private volatile int runningWorkers$volatile;

    public i(a0 a0Var, int i10) {
        j0 j0Var;
        this.f9104c = a0Var;
        this.d = i10;
        if (a0Var instanceof j0) {
            j0Var = (j0) a0Var;
        } else {
            j0Var = null;
        }
        this.f9105e = j0Var == null ? g0.f51586a : j0Var;
        this.f9106f = new l();
        this.h = new Object();
    }

    @Override
    public final o0 a(long j3, e2 e2Var, id.h hVar) {
        return this.f9105e.a(j3, e2Var, hVar);
    }

    @Override
    public final void b(long j3, zd.m mVar) {
        this.f9105e.b(j3, mVar);
    }

    @Override
    public final void c(id.h hVar, Runnable runnable) {
        this.f9106f.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f9103n;
        if (atomicIntegerFieldUpdater.get(this) < this.d) {
            synchronized (this.h) {
                if (atomicIntegerFieldUpdater.get(this) >= this.d) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                Runnable f7 = f();
                if (f7 != null) {
                    this.f9104c.c(this, new i9.s(this, f7, false, 13));
                }
            }
        }
    }

    public final Runnable f() {
        while (true) {
            Runnable runnable = (Runnable) this.f9106f.d();
            if (runnable == null) {
                synchronized (this.h) {
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f9103n;
                    atomicIntegerFieldUpdater.decrementAndGet(this);
                    if (this.f9106f.c() == 0) {
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
