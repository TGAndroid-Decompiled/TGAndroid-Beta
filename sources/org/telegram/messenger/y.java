package org.telegram.messenger;

import java.util.concurrent.atomic.AtomicInteger;
public final class y implements Runnable {
    public final int f22183a;
    public final AtomicInteger f22184b;
    public final AtomicInteger f22185c;
    public final Runnable d;

    public y(AtomicInteger atomicInteger, AtomicInteger atomicInteger2, Runnable runnable, int i9) {
        this.f22183a = i9;
        this.f22184b = atomicInteger;
        this.f22185c = atomicInteger2;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f22183a) {
            case 0:
                BillingController.c(this.f22184b, this.f22185c, this.d);
                return;
            case 1:
                BillingController.g(this.f22184b, this.f22185c, this.d);
                return;
            default:
                BillingController.d(this.f22184b, this.f22185c, this.d);
                return;
        }
    }
}
