package org.telegram.messenger;

import java.util.concurrent.atomic.AtomicInteger;
public final class x implements Runnable {
    public final int f19755a;
    public final AtomicInteger f19756b;
    public final AtomicInteger f19757c;
    public final Runnable d;

    public x(AtomicInteger atomicInteger, AtomicInteger atomicInteger2, Runnable runnable, int i10) {
        this.f19755a = i10;
        this.f19756b = atomicInteger;
        this.f19757c = atomicInteger2;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f19755a) {
            case 0:
                BillingController.c(this.f19756b, this.f19757c, this.d);
                return;
            case 1:
                BillingController.g(this.f19756b, this.f19757c, this.d);
                return;
            default:
                BillingController.d(this.f19756b, this.f19757c, this.d);
                return;
        }
    }
}
