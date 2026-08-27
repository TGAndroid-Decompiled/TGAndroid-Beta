package nd;

import id.a0;
import id.f2;
import id.h0;
import id.k0;
import id.p0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public final class i extends a0 implements k0 {

    public static final AtomicIntegerFieldUpdater f18489n = AtomicIntegerFieldUpdater.newUpdater(i.class, "runningWorkers$volatile");

    public final a0 f18490c;
    public final int d;

    public final k0 f18491e;

    public final l f18492f;
    public final Object h;
    private volatile int runningWorkers$volatile;

    public i(a0 a0Var, int i10) {
        this.f18490c = a0Var;
        this.d = i10;
        k0 k0Var = a0Var instanceof k0 ? (k0) a0Var : null;
        this.f18491e = k0Var == null ? h0.f11156a : k0Var;
        this.f18492f = new l();
        this.h = new Object();
    }

    @Override
    public final void a(long j10, id.m mVar) {
        this.f18491e.a(j10, mVar);
    }

    @Override
    public final p0 b(long j10, f2 f2Var, rc.h hVar) {
        return this.f18491e.b(j10, f2Var, hVar);
    }

    @Override
    public final void c(rc.h hVar, Runnable runnable) {
        this.f18492f.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f18489n;
        if (atomicIntegerFieldUpdater.get(this) < this.d) {
            synchronized (this.h) {
                if (atomicIntegerFieldUpdater.get(this) >= this.d) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                Runnable runnableF = f();
                if (runnableF == null) {
                    return;
                }
                this.f18490c.c(this, new a9.o(28, this, runnableF));
            }
        }
    }

    public final Runnable f() {
        while (true) {
            Runnable runnable = (Runnable) this.f18492f.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.h) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f18489n;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f18492f.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }
}
