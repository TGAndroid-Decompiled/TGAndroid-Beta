package org.telegram.messenger;

import java.util.concurrent.atomic.AtomicInteger;
public final class x implements Runnable {
    public final int f17823a;
    public final AtomicInteger f17824b;
    public final AtomicInteger f17825c;
    public final Runnable d;

    public x(AtomicInteger atomicInteger, AtomicInteger atomicInteger2, Runnable runnable, int i10) {
        this.f17823a = i10;
        this.f17824b = atomicInteger;
        this.f17825c = atomicInteger2;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17823a) {
            case 0:
                BillingController.c(this.f17824b, this.f17825c, this.d);
                return;
            case 1:
                BillingController.g(this.f17824b, this.f17825c, this.d);
                return;
            default:
                BillingController.d(this.f17824b, this.f17825c, this.d);
                return;
        }
    }
}
