package ae;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
public final class m0 extends fe.s {
    public static final AtomicIntegerFieldUpdater f475e = AtomicIntegerFieldUpdater.newUpdater(m0.class, "_decision$volatile");
    private volatile int _decision$volatile;

    @Override
    public final void f(Object obj) {
        g(obj);
    }

    @Override
    public final void g(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f475e;
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 1) {
                    fe.a.g(g0.r(obj), w7.h.b(this.d));
                    return;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
