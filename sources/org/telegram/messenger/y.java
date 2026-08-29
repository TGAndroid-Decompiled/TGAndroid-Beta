package org.telegram.messenger;

import java.util.concurrent.atomic.AtomicInteger;
public final class y implements Runnable {
    public final int f22203a;
    public final AtomicInteger f22204b;
    public final AtomicInteger f22205c;
    public final Runnable d;

    public y(AtomicInteger atomicInteger, AtomicInteger atomicInteger2, Runnable runnable, int i10) {
        this.f22203a = i10;
        this.f22204b = atomicInteger;
        this.f22205c = atomicInteger2;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f22203a) {
            case 0:
                BillingController.c(this.f22204b, this.f22205c, this.d);
                return;
            case 1:
                BillingController.g(this.f22204b, this.f22205c, this.d);
                return;
            default:
                BillingController.d(this.f22204b, this.f22205c, this.d);
                return;
        }
    }
}
