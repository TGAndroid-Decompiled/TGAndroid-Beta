package org.telegram.messenger;

import java.util.concurrent.atomic.AtomicInteger;
public final class y implements Runnable {
    public final int f20661a;
    public final AtomicInteger f20662b;
    public final AtomicInteger f20663c;
    public final Runnable d;

    public y(AtomicInteger atomicInteger, AtomicInteger atomicInteger2, Runnable runnable, int i10) {
        this.f20661a = i10;
        this.f20662b = atomicInteger;
        this.f20663c = atomicInteger2;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f20661a) {
            case 0:
                BillingController.c(this.f20662b, this.f20663c, this.d);
                return;
            case 1:
                BillingController.g(this.f20662b, this.f20663c, this.d);
                return;
            default:
                BillingController.d(this.f20662b, this.f20663c, this.d);
                return;
        }
    }
}
