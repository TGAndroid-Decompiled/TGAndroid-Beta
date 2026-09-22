package org.telegram.messenger;

import java.util.concurrent.atomic.AtomicInteger;
public final class x implements Runnable {
    public final int f17813a;
    public final AtomicInteger f17814b;
    public final AtomicInteger f17815c;
    public final Runnable d;

    public x(AtomicInteger atomicInteger, AtomicInteger atomicInteger2, Runnable runnable, int i10) {
        this.f17813a = i10;
        this.f17814b = atomicInteger;
        this.f17815c = atomicInteger2;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17813a) {
            case 0:
                BillingController.c(this.f17814b, this.f17815c, this.d);
                return;
            case 1:
                BillingController.g(this.f17814b, this.f17815c, this.d);
                return;
            default:
                BillingController.d(this.f17814b, this.f17815c, this.d);
                return;
        }
    }
}
