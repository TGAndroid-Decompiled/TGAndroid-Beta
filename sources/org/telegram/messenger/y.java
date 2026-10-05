package org.telegram.messenger;

import java.util.concurrent.atomic.AtomicInteger;
public final class y implements Runnable {
    public final int f19850a;
    public final AtomicInteger f19851b;
    public final AtomicInteger f19852c;
    public final Runnable d;

    public y(AtomicInteger atomicInteger, AtomicInteger atomicInteger2, Runnable runnable, int i10) {
        this.f19850a = i10;
        this.f19851b = atomicInteger;
        this.f19852c = atomicInteger2;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f19850a) {
            case 0:
                BillingController.c(this.f19851b, this.f19852c, this.d);
                return;
            case 1:
                BillingController.g(this.f19851b, this.f19852c, this.d);
                return;
            default:
                BillingController.d(this.f19851b, this.f19852c, this.d);
                return;
        }
    }
}
