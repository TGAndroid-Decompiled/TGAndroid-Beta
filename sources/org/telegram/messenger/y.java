package org.telegram.messenger;

import java.util.concurrent.atomic.AtomicInteger;
public final class y implements Runnable {
    public final int f19854a;
    public final AtomicInteger f19855b;
    public final AtomicInteger f19856c;
    public final Runnable d;

    public y(AtomicInteger atomicInteger, AtomicInteger atomicInteger2, Runnable runnable, int i10) {
        this.f19854a = i10;
        this.f19855b = atomicInteger;
        this.f19856c = atomicInteger2;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f19854a) {
            case 0:
                BillingController.c(this.f19855b, this.f19856c, this.d);
                return;
            case 1:
                BillingController.g(this.f19855b, this.f19856c, this.d);
                return;
            default:
                BillingController.d(this.f19855b, this.f19856c, this.d);
                return;
        }
    }
}
