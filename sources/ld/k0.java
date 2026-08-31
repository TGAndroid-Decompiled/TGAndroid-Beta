package ld;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import k7.h8;
public final class k0 extends qd.s {
    public static final AtomicIntegerFieldUpdater f12325e = AtomicIntegerFieldUpdater.newUpdater(k0.class, "_decision$volatile");
    private volatile int _decision$volatile;

    @Override
    public final void f(Object obj) {
        g(obj);
    }

    @Override
    public final void g(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f12325e;
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 1) {
                    qd.a.g(e0.r(obj), h8.b(this.d));
                    return;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
