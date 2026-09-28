package org.telegram.messenger;

import java.util.concurrent.atomic.AtomicInteger;
public final class x implements Runnable {
    public final int f18083a;
    public final AtomicInteger f18084b;
    public final AtomicInteger f18085c;
    public final Runnable d;

    public x(AtomicInteger atomicInteger, AtomicInteger atomicInteger2, Runnable runnable, int i10) {
        this.f18083a = i10;
        this.f18084b = atomicInteger;
        this.f18085c = atomicInteger2;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18083a) {
            case 0:
                BillingController.c(this.f18084b, this.f18085c, this.d);
                return;
            case 1:
                BillingController.g(this.f18084b, this.f18085c, this.d);
                return;
            default:
                BillingController.d(this.f18084b, this.f18085c, this.d);
                return;
        }
    }
}
