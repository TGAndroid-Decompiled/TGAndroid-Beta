package be;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
public final class l0 extends ge.s {
    public static final AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(l0.class, "_decision$volatile");
    private volatile int _decision$volatile;

    @Override
    public final void b(Object obj) {
        g(obj);
    }

    @Override
    public final void g(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = e;
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 1) {
                    ge.a.g(f0.r(obj), w7.n.b(this.d));
                    return;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
