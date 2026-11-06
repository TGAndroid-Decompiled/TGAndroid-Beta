package org.telegram.messenger;

import java.util.concurrent.atomic.AtomicInteger;
public final class i1 implements Runnable {
    public final int f23013a;
    public final AtomicInteger f23014b;
    public final AtomicInteger f23015c;
    public final Runnable d;

    public i1(AtomicInteger atomicInteger, AtomicInteger atomicInteger2, Runnable runnable, int i7) {
        this.f23013a = i7;
        this.f23014b = atomicInteger;
        this.f23015c = atomicInteger2;
        this.d = runnable;
    }

    @Override
    public final void run() {
        Runnable runnable;
        Runnable runnable2;
        Runnable runnable3;
        switch (this.f23013a) {
            case 0:
                if (this.f23014b.incrementAndGet() == this.f23015c.get() && (runnable = this.d) != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                if (this.f23014b.incrementAndGet() == this.f23015c.get() && (runnable2 = this.d) != null) {
                    runnable2.run();
                    return;
                }
                return;
            default:
                if (this.f23014b.incrementAndGet() == this.f23015c.get() && (runnable3 = this.d) != null) {
                    runnable3.run();
                    return;
                }
                return;
        }
    }
}
