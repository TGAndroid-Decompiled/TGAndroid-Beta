package hd;

import g7.g7;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
public final class l0 extends md.s {
    public static final AtomicIntegerFieldUpdater f10455e = AtomicIntegerFieldUpdater.newUpdater(l0.class, "_decision$volatile");
    private volatile int _decision$volatile;

    @Override
    public final void f(Object obj) {
        g(obj);
    }

    @Override
    public final void g(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f10455e;
            int i9 = atomicIntegerFieldUpdater.get(this);
            if (i9 != 0) {
                if (i9 == 1) {
                    md.a.g(f0.r(obj), g7.b(this.d));
                    return;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
