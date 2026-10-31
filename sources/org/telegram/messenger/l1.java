package org.telegram.messenger;

import java.util.concurrent.atomic.AtomicInteger;
public final class l1 implements Runnable {
    public final int f16662a;
    public final AtomicInteger f16663b;
    public final AtomicInteger f16664c;
    public final Runnable d;

    public l1(AtomicInteger atomicInteger, AtomicInteger atomicInteger2, Runnable runnable, int i10) {
        this.f16662a = i10;
        this.f16663b = atomicInteger;
        this.f16664c = atomicInteger2;
        this.d = runnable;
    }

    @Override
    public final void run() {
        Runnable runnable;
        Runnable runnable2;
        Runnable runnable3;
        switch (this.f16662a) {
            case 0:
                if (this.f16663b.incrementAndGet() == this.f16664c.get() && (runnable = this.d) != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                if (this.f16663b.incrementAndGet() == this.f16664c.get() && (runnable2 = this.d) != null) {
                    runnable2.run();
                    return;
                }
                return;
            default:
                if (this.f16663b.incrementAndGet() == this.f16664c.get() && (runnable3 = this.d) != null) {
                    runnable3.run();
                    return;
                }
                return;
        }
    }
}
