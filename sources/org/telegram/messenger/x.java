package org.telegram.messenger;

import java.util.concurrent.atomic.AtomicInteger;
public final class x implements Runnable {
    public final int f17814a;
    public final AtomicInteger f17815b;
    public final AtomicInteger f17816c;
    public final Runnable d;

    public x(AtomicInteger atomicInteger, AtomicInteger atomicInteger2, Runnable runnable, int i10) {
        this.f17814a = i10;
        this.f17815b = atomicInteger;
        this.f17816c = atomicInteger2;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17814a) {
            case 0:
                BillingController.c(this.f17815b, this.f17816c, this.d);
                return;
            case 1:
                BillingController.g(this.f17815b, this.f17816c, this.d);
                return;
            default:
                BillingController.d(this.f17815b, this.f17816c, this.d);
                return;
        }
    }
}
