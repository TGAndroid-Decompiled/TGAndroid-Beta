package org.telegram.messenger;

import java.util.concurrent.atomic.AtomicInteger;
public final class x implements Runnable {
    public final int f18069a;
    public final AtomicInteger f18070b;
    public final AtomicInteger f18071c;
    public final Runnable d;

    public x(AtomicInteger atomicInteger, AtomicInteger atomicInteger2, Runnable runnable, int i10) {
        this.f18069a = i10;
        this.f18070b = atomicInteger;
        this.f18071c = atomicInteger2;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18069a) {
            case 0:
                BillingController.c(this.f18070b, this.f18071c, this.d);
                return;
            case 1:
                BillingController.g(this.f18070b, this.f18071c, this.d);
                return;
            default:
                BillingController.d(this.f18070b, this.f18071c, this.d);
                return;
        }
    }
}
