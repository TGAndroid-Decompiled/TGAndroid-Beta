package org.telegram.messenger;

import java.util.concurrent.atomic.AtomicInteger;
public final class x implements Runnable {
    public final int f18099a;
    public final AtomicInteger f18100b;
    public final AtomicInteger f18101c;
    public final Runnable d;

    public x(AtomicInteger atomicInteger, AtomicInteger atomicInteger2, Runnable runnable, int i10) {
        this.f18099a = i10;
        this.f18100b = atomicInteger;
        this.f18101c = atomicInteger2;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18099a) {
            case 0:
                BillingController.c(this.f18100b, this.f18101c, this.d);
                return;
            case 1:
                BillingController.g(this.f18100b, this.f18101c, this.d);
                return;
            default:
                BillingController.d(this.f18100b, this.f18101c, this.d);
                return;
        }
    }
}
