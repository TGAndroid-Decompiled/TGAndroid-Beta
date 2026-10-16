package org.telegram.messenger;

import java.util.concurrent.atomic.AtomicInteger;
public final class y implements Runnable {
    public final int f18751a;
    public final AtomicInteger f18752b;
    public final AtomicInteger f18753c;
    public final Runnable d;

    public y(AtomicInteger atomicInteger, AtomicInteger atomicInteger2, Runnable runnable, int i10) {
        this.f18751a = i10;
        this.f18752b = atomicInteger;
        this.f18753c = atomicInteger2;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18751a) {
            case 0:
                BillingController.c(this.f18752b, this.f18753c, this.d);
                return;
            case 1:
                BillingController.g(this.f18752b, this.f18753c, this.d);
                return;
            default:
                BillingController.d(this.f18752b, this.f18753c, this.d);
                return;
        }
    }
}
