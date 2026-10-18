package be;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
public final class f1 extends i1 {
    public static final AtomicIntegerFieldUpdater f4288f = AtomicIntegerFieldUpdater.newUpdater(f1.class, "_invoked$volatile");
    private volatile int _invoked$volatile;
    public final e1 e;

    public f1(e1 e1Var) {
        this.e = e1Var;
    }

    @Override
    public final void a(Throwable th2) {
        if (f4288f.compareAndSet(this, 0, 1)) {
            this.e.a(th2);
        }
    }
}
