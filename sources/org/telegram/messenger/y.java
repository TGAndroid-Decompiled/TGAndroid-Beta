package org.telegram.messenger;

import java.util.concurrent.atomic.AtomicInteger;
public final class y implements Runnable {
    public final int f20172a;
    public final AtomicInteger f20173b;
    public final AtomicInteger f20174c;
    public final Runnable d;

    public y(AtomicInteger atomicInteger, AtomicInteger atomicInteger2, Runnable runnable, int i10) {
        this.f20172a = i10;
        this.f20173b = atomicInteger;
        this.f20174c = atomicInteger2;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f20172a) {
            case 0:
                BillingController.c(this.f20173b, this.f20174c, this.d);
                return;
            case 1:
                BillingController.g(this.f20173b, this.f20174c, this.d);
                return;
            default:
                BillingController.d(this.f20173b, this.f20174c, this.d);
                return;
        }
    }
}
