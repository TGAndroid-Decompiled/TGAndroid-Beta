package org.telegram.messenger;

import java.util.concurrent.atomic.AtomicInteger;
public final class x implements Runnable {
    public final int f18084a;
    public final AtomicInteger f18085b;
    public final AtomicInteger f18086c;
    public final Runnable d;

    public x(AtomicInteger atomicInteger, AtomicInteger atomicInteger2, Runnable runnable, int i10) {
        this.f18084a = i10;
        this.f18085b = atomicInteger;
        this.f18086c = atomicInteger2;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18084a) {
            case 0:
                BillingController.c(this.f18085b, this.f18086c, this.d);
                return;
            case 1:
                BillingController.g(this.f18085b, this.f18086c, this.d);
                return;
            default:
                BillingController.d(this.f18085b, this.f18086c, this.d);
                return;
        }
    }
}
