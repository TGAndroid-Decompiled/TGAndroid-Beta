package jd;

import i7.v7;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
public final class k0 extends od.t {
    public static final AtomicIntegerFieldUpdater f11489e = AtomicIntegerFieldUpdater.newUpdater(k0.class, "_decision$volatile");
    private volatile int _decision$volatile;

    @Override
    public final void f(Object obj) {
        g(obj);
    }

    @Override
    public final void g(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f11489e;
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 1) {
                    od.a.g(e0.r(obj), v7.b(this.d));
                    return;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
