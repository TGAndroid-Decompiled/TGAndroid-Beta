package org.telegram.messenger;

import java.util.concurrent.atomic.AtomicInteger;
public final class y implements Runnable {
    public final int f20111a;
    public final AtomicInteger f20112b;
    public final AtomicInteger f20113c;
    public final Runnable d;

    public y(AtomicInteger atomicInteger, AtomicInteger atomicInteger2, Runnable runnable, int i10) {
        this.f20111a = i10;
        this.f20112b = atomicInteger;
        this.f20113c = atomicInteger2;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f20111a) {
            case 0:
                BillingController.c(this.f20112b, this.f20113c, this.d);
                return;
            case 1:
                BillingController.g(this.f20112b, this.f20113c, this.d);
                return;
            default:
                BillingController.d(this.f20112b, this.f20113c, this.d);
                return;
        }
    }
}
