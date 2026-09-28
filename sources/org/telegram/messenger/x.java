package org.telegram.messenger;

import java.util.concurrent.atomic.AtomicInteger;
public final class x implements Runnable {
    public final int f18082a;
    public final AtomicInteger f18083b;
    public final AtomicInteger f18084c;
    public final Runnable d;

    public x(AtomicInteger atomicInteger, AtomicInteger atomicInteger2, Runnable runnable, int i10) {
        this.f18082a = i10;
        this.f18083b = atomicInteger;
        this.f18084c = atomicInteger2;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18082a) {
            case 0:
                BillingController.c(this.f18083b, this.f18084c, this.d);
                return;
            case 1:
                BillingController.g(this.f18083b, this.f18084c, this.d);
                return;
            default:
                BillingController.d(this.f18083b, this.f18084c, this.d);
                return;
        }
    }
}
