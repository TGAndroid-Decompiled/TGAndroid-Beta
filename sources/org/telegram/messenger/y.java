package org.telegram.messenger;

import java.util.concurrent.atomic.AtomicInteger;
public final class y implements Runnable {
    public final int f20106a;
    public final AtomicInteger f20107b;
    public final AtomicInteger f20108c;
    public final Runnable d;

    public y(AtomicInteger atomicInteger, AtomicInteger atomicInteger2, Runnable runnable, int i10) {
        this.f20106a = i10;
        this.f20107b = atomicInteger;
        this.f20108c = atomicInteger2;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f20106a) {
            case 0:
                BillingController.c(this.f20107b, this.f20108c, this.d);
                return;
            case 1:
                BillingController.g(this.f20107b, this.f20108c, this.d);
                return;
            default:
                BillingController.d(this.f20107b, this.f20108c, this.d);
                return;
        }
    }
}
