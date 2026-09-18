package org.telegram.messenger;

import java.util.concurrent.atomic.AtomicInteger;
public final class y implements Runnable {
    public final int f18091a;
    public final AtomicInteger f18092b;
    public final AtomicInteger f18093c;
    public final Runnable d;

    public y(AtomicInteger atomicInteger, AtomicInteger atomicInteger2, Runnable runnable, int i10) {
        this.f18091a = i10;
        this.f18092b = atomicInteger;
        this.f18093c = atomicInteger2;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18091a) {
            case 0:
                BillingController.c(this.f18092b, this.f18093c, this.d);
                return;
            case 1:
                BillingController.g(this.f18092b, this.f18093c, this.d);
                return;
            default:
                BillingController.d(this.f18092b, this.f18093c, this.d);
                return;
        }
    }
}
