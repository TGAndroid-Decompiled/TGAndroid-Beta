package org.telegram.messenger;

import java.util.concurrent.atomic.AtomicInteger;
public final class x implements Runnable {
    public final int f18060a;
    public final AtomicInteger f18061b;
    public final AtomicInteger f18062c;
    public final Runnable d;

    public x(AtomicInteger atomicInteger, AtomicInteger atomicInteger2, Runnable runnable, int i10) {
        this.f18060a = i10;
        this.f18061b = atomicInteger;
        this.f18062c = atomicInteger2;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18060a) {
            case 0:
                BillingController.c(this.f18061b, this.f18062c, this.d);
                return;
            case 1:
                BillingController.g(this.f18061b, this.f18062c, this.d);
                return;
            default:
                BillingController.d(this.f18061b, this.f18062c, this.d);
                return;
        }
    }
}
