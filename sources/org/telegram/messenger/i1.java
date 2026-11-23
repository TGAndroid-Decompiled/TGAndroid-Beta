package org.telegram.messenger;

import java.util.concurrent.atomic.AtomicInteger;
public final class i1 implements Runnable {
    public final int f24568a;
    public final AtomicInteger f24569b;
    public final AtomicInteger f24570c;
    public final Runnable d;

    public i1(AtomicInteger atomicInteger, AtomicInteger atomicInteger2, Runnable runnable, int i7) {
        this.f24568a = i7;
        this.f24569b = atomicInteger;
        this.f24570c = atomicInteger2;
        this.d = runnable;
    }

    @Override
    public final void run() {
        Runnable runnable;
        Runnable runnable2;
        Runnable runnable3;
        switch (this.f24568a) {
            case 0:
                if (this.f24569b.incrementAndGet() == this.f24570c.get() && (runnable = this.d) != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                if (this.f24569b.incrementAndGet() == this.f24570c.get() && (runnable2 = this.d) != null) {
                    runnable2.run();
                    return;
                }
                return;
            default:
                if (this.f24569b.incrementAndGet() == this.f24570c.get() && (runnable3 = this.d) != null) {
                    runnable3.run();
                    return;
                }
                return;
        }
    }
}
