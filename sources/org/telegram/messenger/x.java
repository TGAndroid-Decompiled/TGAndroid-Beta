package org.telegram.messenger;

import java.util.concurrent.atomic.AtomicInteger;
public final class x implements Runnable {
    public final int f18075a;
    public final AtomicInteger f18076b;
    public final AtomicInteger f18077c;
    public final Runnable d;

    public x(AtomicInteger atomicInteger, AtomicInteger atomicInteger2, Runnable runnable, int i10) {
        this.f18075a = i10;
        this.f18076b = atomicInteger;
        this.f18077c = atomicInteger2;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18075a) {
            case 0:
                BillingController.c(this.f18076b, this.f18077c, this.d);
                return;
            case 1:
                BillingController.g(this.f18076b, this.f18077c, this.d);
                return;
            default:
                BillingController.d(this.f18076b, this.f18077c, this.d);
                return;
        }
    }
}
