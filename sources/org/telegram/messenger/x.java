package org.telegram.messenger;

import java.util.concurrent.atomic.AtomicInteger;
public final class x implements Runnable {
    public final int f19572a;
    public final AtomicInteger f19573b;
    public final AtomicInteger f19574c;
    public final Runnable d;

    public x(AtomicInteger atomicInteger, AtomicInteger atomicInteger2, Runnable runnable, int i10) {
        this.f19572a = i10;
        this.f19573b = atomicInteger;
        this.f19574c = atomicInteger2;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f19572a) {
            case 0:
                BillingController.c(this.f19573b, this.f19574c, this.d);
                return;
            case 1:
                BillingController.g(this.f19573b, this.f19574c, this.d);
                return;
            default:
                BillingController.d(this.f19573b, this.f19574c, this.d);
                return;
        }
    }
}
