package org.telegram.messenger;

import java.util.concurrent.atomic.AtomicInteger;
public final class b0 implements Runnable {
    public final int f19670a;
    public final AtomicInteger f19671b;
    public final AtomicInteger f19672c;
    public final Runnable d;

    public b0(AtomicInteger atomicInteger, AtomicInteger atomicInteger2, Runnable runnable, int i10) {
        this.f19670a = i10;
        this.f19671b = atomicInteger;
        this.f19672c = atomicInteger2;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f19670a) {
            case 0:
                BillingController.c(this.f19671b, this.f19672c, this.d);
                return;
            case 1:
                BillingController.g(this.f19671b, this.f19672c, this.d);
                return;
            default:
                BillingController.d(this.f19671b, this.f19672c, this.d);
                return;
        }
    }
}
