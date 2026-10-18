package org.telegram.messenger;

import java.util.concurrent.atomic.AtomicInteger;
public final class y implements Runnable {
    public final int f20112a;
    public final AtomicInteger f20113b;
    public final AtomicInteger f20114c;
    public final Runnable d;

    public y(AtomicInteger atomicInteger, AtomicInteger atomicInteger2, Runnable runnable, int i10) {
        this.f20112a = i10;
        this.f20113b = atomicInteger;
        this.f20114c = atomicInteger2;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f20112a) {
            case 0:
                BillingController.c(this.f20113b, this.f20114c, this.d);
                return;
            case 1:
                BillingController.g(this.f20113b, this.f20114c, this.d);
                return;
            default:
                BillingController.d(this.f20113b, this.f20114c, this.d);
                return;
        }
    }
}
