package org.telegram.messenger;

import java.util.concurrent.atomic.AtomicInteger;
public final class i1 implements Runnable {
    public final int f23011a;
    public final AtomicInteger f23012b;
    public final AtomicInteger f23013c;
    public final Runnable d;

    public i1(AtomicInteger atomicInteger, AtomicInteger atomicInteger2, Runnable runnable, int i7) {
        this.f23011a = i7;
        this.f23012b = atomicInteger;
        this.f23013c = atomicInteger2;
        this.d = runnable;
    }

    @Override
    public final void run() {
        Runnable runnable;
        Runnable runnable2;
        Runnable runnable3;
        switch (this.f23011a) {
            case 0:
                if (this.f23012b.incrementAndGet() == this.f23013c.get() && (runnable = this.d) != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                if (this.f23012b.incrementAndGet() == this.f23013c.get() && (runnable2 = this.d) != null) {
                    runnable2.run();
                    return;
                }
                return;
            default:
                if (this.f23012b.incrementAndGet() == this.f23013c.get() && (runnable3 = this.d) != null) {
                    runnable3.run();
                    return;
                }
                return;
        }
    }
}
