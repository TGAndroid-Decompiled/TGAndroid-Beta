package ae;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
public final class g1 extends j1 {
    public static final AtomicIntegerFieldUpdater f458f = AtomicIntegerFieldUpdater.newUpdater(g1.class, "_invoked$volatile");
    private volatile int _invoked$volatile;
    public final f1 f459e;

    public g1(f1 f1Var) {
        this.f459e = f1Var;
    }

    @Override
    public final void a(Throwable th2) {
        if (f458f.compareAndSet(this, 0, 1)) {
            this.f459e.a(th2);
        }
    }
}
