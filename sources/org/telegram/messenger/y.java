package org.telegram.messenger;

import java.util.concurrent.atomic.AtomicInteger;
public final class y implements Runnable {
    public final int f20177a;
    public final AtomicInteger f20178b;
    public final AtomicInteger f20179c;
    public final Runnable d;

    public y(AtomicInteger atomicInteger, AtomicInteger atomicInteger2, Runnable runnable, int i10) {
        this.f20177a = i10;
        this.f20178b = atomicInteger;
        this.f20179c = atomicInteger2;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f20177a) {
            case 0:
                BillingController.c(this.f20178b, this.f20179c, this.d);
                return;
            case 1:
                BillingController.g(this.f20178b, this.f20179c, this.d);
                return;
            default:
                BillingController.d(this.f20178b, this.f20179c, this.d);
                return;
        }
    }
}
