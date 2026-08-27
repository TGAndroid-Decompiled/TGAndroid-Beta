package id;

import h7.h7;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public final class l0 extends nd.s {

    public static final AtomicIntegerFieldUpdater f11164e = AtomicIntegerFieldUpdater.newUpdater(l0.class, "_decision$volatile");
    private volatile int _decision$volatile;

    @Override
    public final void f(Object obj) {
        g(obj);
    }

    @Override
    public final void g(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f11164e;
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                nd.a.g(f0.r(obj), h7.b(this.d));
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
