package org.telegram.messenger;

import java.util.concurrent.atomic.AtomicInteger;
public final class x implements Runnable {
    public final int f18059a;
    public final AtomicInteger f18060b;
    public final AtomicInteger f18061c;
    public final Runnable d;

    public x(AtomicInteger atomicInteger, AtomicInteger atomicInteger2, Runnable runnable, int i10) {
        this.f18059a = i10;
        this.f18060b = atomicInteger;
        this.f18061c = atomicInteger2;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18059a) {
            case 0:
                BillingController.c(this.f18060b, this.f18061c, this.d);
                return;
            case 1:
                BillingController.g(this.f18060b, this.f18061c, this.d);
                return;
            default:
                BillingController.d(this.f18060b, this.f18061c, this.d);
                return;
        }
    }
}
