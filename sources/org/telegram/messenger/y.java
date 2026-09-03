package org.telegram.messenger;

import java.util.concurrent.atomic.AtomicInteger;
public final class y implements Runnable {
    public final int f18991a;
    public final AtomicInteger f18992b;
    public final AtomicInteger f18993c;
    public final Runnable d;

    public y(AtomicInteger atomicInteger, AtomicInteger atomicInteger2, Runnable runnable, int i10) {
        this.f18991a = i10;
        this.f18992b = atomicInteger;
        this.f18993c = atomicInteger2;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18991a) {
            case 0:
                BillingController.c(this.f18992b, this.f18993c, this.d);
                return;
            case 1:
                BillingController.g(this.f18992b, this.f18993c, this.d);
                return;
            default:
                BillingController.d(this.f18992b, this.f18993c, this.d);
                return;
        }
    }
}
