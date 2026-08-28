package hd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
public final class f1 extends i1 {
    public static final AtomicIntegerFieldUpdater f10438f = AtomicIntegerFieldUpdater.newUpdater(f1.class, "_invoked$volatile");
    private volatile int _invoked$volatile;
    public final e1 f10439e;

    public f1(e1 e1Var) {
        this.f10439e = e1Var;
    }

    @Override
    public final void a(Throwable th) {
        if (f10438f.compareAndSet(this, 0, 1)) {
            this.f10439e.a(th);
        }
    }
}
