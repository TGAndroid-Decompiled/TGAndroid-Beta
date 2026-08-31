package ld;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
public final class e1 extends h1 {
    public static final AtomicIntegerFieldUpdater f12304f = AtomicIntegerFieldUpdater.newUpdater(e1.class, "_invoked$volatile");
    private volatile int _invoked$volatile;
    public final d1 f12305e;

    public e1(d1 d1Var) {
        this.f12305e = d1Var;
    }

    @Override
    public final void a(Throwable th2) {
        if (f12304f.compareAndSet(this, 0, 1)) {
            this.f12305e.a(th2);
        }
    }
}
