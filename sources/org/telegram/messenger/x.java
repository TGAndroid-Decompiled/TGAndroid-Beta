package org.telegram.messenger;

import java.util.concurrent.atomic.AtomicInteger;
public final class x implements Runnable {
    public final int f18044a;
    public final AtomicInteger f18045b;
    public final AtomicInteger f18046c;
    public final Runnable d;

    public x(AtomicInteger atomicInteger, AtomicInteger atomicInteger2, Runnable runnable, int i10) {
        this.f18044a = i10;
        this.f18045b = atomicInteger;
        this.f18046c = atomicInteger2;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18044a) {
            case 0:
                BillingController.c(this.f18045b, this.f18046c, this.d);
                return;
            case 1:
                BillingController.g(this.f18045b, this.f18046c, this.d);
                return;
            default:
                BillingController.d(this.f18045b, this.f18046c, this.d);
                return;
        }
    }
}
