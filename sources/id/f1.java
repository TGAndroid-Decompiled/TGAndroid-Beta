package id;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public final class f1 extends i1 {

    public static final AtomicIntegerFieldUpdater f11147f = AtomicIntegerFieldUpdater.newUpdater(f1.class, "_invoked$volatile");
    private volatile int _invoked$volatile;

    public final e1 f11148e;

    public f1(e1 e1Var) {
        this.f11148e = e1Var;
    }

    @Override
    public final void a(Throwable th) {
        if (f11147f.compareAndSet(this, 0, 1)) {
            this.f11148e.a(th);
        }
    }
}
