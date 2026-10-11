package org.telegram.messenger;

import java.util.concurrent.atomic.AtomicInteger;
public final class y implements Runnable {
    public final int f19881a;
    public final AtomicInteger f19882b;
    public final AtomicInteger f19883c;
    public final Runnable d;

    public y(AtomicInteger atomicInteger, AtomicInteger atomicInteger2, Runnable runnable, int i10) {
        this.f19881a = i10;
        this.f19882b = atomicInteger;
        this.f19883c = atomicInteger2;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f19881a) {
            case 0:
                BillingController.c(this.f19882b, this.f19883c, this.d);
                return;
            case 1:
                BillingController.g(this.f19882b, this.f19883c, this.d);
                return;
            default:
                BillingController.d(this.f19882b, this.f19883c, this.d);
                return;
        }
    }
}
