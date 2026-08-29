package jd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
public final class e1 extends h1 {
    public static final AtomicIntegerFieldUpdater f11468f = AtomicIntegerFieldUpdater.newUpdater(e1.class, "_invoked$volatile");
    private volatile int _invoked$volatile;
    public final d1 f11469e;

    public e1(d1 d1Var) {
        this.f11469e = d1Var;
    }

    @Override
    public final void a(Throwable th2) {
        if (f11468f.compareAndSet(this, 0, 1)) {
            this.f11469e.a(th2);
        }
    }
}
