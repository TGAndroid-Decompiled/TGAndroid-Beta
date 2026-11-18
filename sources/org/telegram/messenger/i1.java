package org.telegram.messenger;

import java.util.concurrent.atomic.AtomicInteger;
public final class i1 implements Runnable {
    public final int f24536a;
    public final AtomicInteger f24537b;
    public final AtomicInteger f24538c;
    public final Runnable d;

    public i1(AtomicInteger atomicInteger, AtomicInteger atomicInteger2, Runnable runnable, int i7) {
        this.f24536a = i7;
        this.f24537b = atomicInteger;
        this.f24538c = atomicInteger2;
        this.d = runnable;
    }

    @Override
    public final void run() {
        Runnable runnable;
        Runnable runnable2;
        Runnable runnable3;
        switch (this.f24536a) {
            case 0:
                if (this.f24537b.incrementAndGet() == this.f24538c.get() && (runnable = this.d) != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                if (this.f24537b.incrementAndGet() == this.f24538c.get() && (runnable2 = this.d) != null) {
                    runnable2.run();
                    return;
                }
                return;
            default:
                if (this.f24537b.incrementAndGet() == this.f24538c.get() && (runnable3 = this.d) != null) {
                    runnable3.run();
                    return;
                }
                return;
        }
    }
}
