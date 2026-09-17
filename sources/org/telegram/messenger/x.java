package org.telegram.messenger;

import java.util.concurrent.atomic.AtomicInteger;
public final class x implements Runnable {
    public final int f19599a;
    public final AtomicInteger f19600b;
    public final AtomicInteger f19601c;
    public final Runnable d;

    public x(AtomicInteger atomicInteger, AtomicInteger atomicInteger2, Runnable runnable, int i10) {
        this.f19599a = i10;
        this.f19600b = atomicInteger;
        this.f19601c = atomicInteger2;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f19599a) {
            case 0:
                BillingController.c(this.f19600b, this.f19601c, this.d);
                return;
            case 1:
                BillingController.g(this.f19600b, this.f19601c, this.d);
                return;
            default:
                BillingController.d(this.f19600b, this.f19601c, this.d);
                return;
        }
    }
}
