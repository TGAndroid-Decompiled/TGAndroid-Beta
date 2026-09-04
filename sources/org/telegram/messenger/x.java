package org.telegram.messenger;

import java.util.concurrent.atomic.AtomicInteger;
public final class x implements Runnable {
    public final int f19535a;
    public final AtomicInteger f19536b;
    public final AtomicInteger f19537c;
    public final Runnable d;

    public x(AtomicInteger atomicInteger, AtomicInteger atomicInteger2, Runnable runnable, int i10) {
        this.f19535a = i10;
        this.f19536b = atomicInteger;
        this.f19537c = atomicInteger2;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f19535a) {
            case 0:
                BillingController.c(this.f19536b, this.f19537c, this.d);
                return;
            case 1:
                BillingController.g(this.f19536b, this.f19537c, this.d);
                return;
            default:
                BillingController.d(this.f19536b, this.f19537c, this.d);
                return;
        }
    }
}
