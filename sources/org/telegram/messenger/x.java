package org.telegram.messenger;

import java.util.concurrent.atomic.AtomicInteger;
public final class x implements Runnable {
    public final int f16926a;
    public final AtomicInteger f16927b;
    public final AtomicInteger f16928c;
    public final Runnable d;

    public x(AtomicInteger atomicInteger, AtomicInteger atomicInteger2, Runnable runnable, int i10) {
        this.f16926a = i10;
        this.f16927b = atomicInteger;
        this.f16928c = atomicInteger2;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f16926a) {
            case 0:
                BillingController.c(this.f16927b, this.f16928c, this.d);
                return;
            case 1:
                BillingController.g(this.f16927b, this.f16928c, this.d);
                return;
            default:
                BillingController.d(this.f16927b, this.f16928c, this.d);
                return;
        }
    }
}
