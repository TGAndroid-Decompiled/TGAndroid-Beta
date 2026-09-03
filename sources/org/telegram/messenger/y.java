package org.telegram.messenger;

import java.util.concurrent.atomic.AtomicInteger;
public final class y implements Runnable {
    public final int f20663a;
    public final AtomicInteger f20664b;
    public final AtomicInteger f20665c;
    public final Runnable d;

    public y(AtomicInteger atomicInteger, AtomicInteger atomicInteger2, Runnable runnable, int i10) {
        this.f20663a = i10;
        this.f20664b = atomicInteger;
        this.f20665c = atomicInteger2;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f20663a) {
            case 0:
                BillingController.c(this.f20664b, this.f20665c, this.d);
                return;
            case 1:
                BillingController.g(this.f20664b, this.f20665c, this.d);
                return;
            default:
                BillingController.d(this.f20664b, this.f20665c, this.d);
                return;
        }
    }
}
