package org.telegram.messenger;

import java.util.concurrent.atomic.AtomicInteger;
public final class i1 implements Runnable {
    public final int f23015a;
    public final AtomicInteger f23016b;
    public final AtomicInteger f23017c;
    public final Runnable d;

    public i1(AtomicInteger atomicInteger, AtomicInteger atomicInteger2, Runnable runnable, int i7) {
        this.f23015a = i7;
        this.f23016b = atomicInteger;
        this.f23017c = atomicInteger2;
        this.d = runnable;
    }

    @Override
    public final void run() {
        Runnable runnable;
        Runnable runnable2;
        Runnable runnable3;
        switch (this.f23015a) {
            case 0:
                if (this.f23016b.incrementAndGet() == this.f23017c.get() && (runnable = this.d) != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                if (this.f23016b.incrementAndGet() == this.f23017c.get() && (runnable2 = this.d) != null) {
                    runnable2.run();
                    return;
                }
                return;
            default:
                if (this.f23016b.incrementAndGet() == this.f23017c.get() && (runnable3 = this.d) != null) {
                    runnable3.run();
                    return;
                }
                return;
        }
    }
}
