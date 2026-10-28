package org.telegram.messenger;

import java.util.concurrent.atomic.AtomicInteger;
public final class b0 implements Runnable {
    public final int f19659a;
    public final AtomicInteger f19660b;
    public final AtomicInteger f19661c;
    public final Runnable d;

    public b0(AtomicInteger atomicInteger, AtomicInteger atomicInteger2, Runnable runnable, int i10) {
        this.f19659a = i10;
        this.f19660b = atomicInteger;
        this.f19661c = atomicInteger2;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f19659a) {
            case 0:
                BillingController.c(this.f19660b, this.f19661c, this.d);
                return;
            case 1:
                BillingController.g(this.f19660b, this.f19661c, this.d);
                return;
            default:
                BillingController.d(this.f19660b, this.f19661c, this.d);
                return;
        }
    }
}
