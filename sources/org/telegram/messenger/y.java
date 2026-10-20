package org.telegram.messenger;

import java.util.concurrent.atomic.AtomicInteger;
public final class y implements Runnable {
    public final int f20114a;
    public final AtomicInteger f20115b;
    public final AtomicInteger f20116c;
    public final Runnable d;

    public y(AtomicInteger atomicInteger, AtomicInteger atomicInteger2, Runnable runnable, int i10) {
        this.f20114a = i10;
        this.f20115b = atomicInteger;
        this.f20116c = atomicInteger2;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f20114a) {
            case 0:
                BillingController.c(this.f20115b, this.f20116c, this.d);
                return;
            case 1:
                BillingController.g(this.f20115b, this.f20116c, this.d);
                return;
            default:
                BillingController.d(this.f20115b, this.f20116c, this.d);
                return;
        }
    }
}
