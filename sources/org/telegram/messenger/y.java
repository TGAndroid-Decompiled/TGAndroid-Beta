package org.telegram.messenger;

import java.util.concurrent.atomic.AtomicInteger;
public final class y implements Runnable {
    public final int f19845a;
    public final AtomicInteger f19846b;
    public final AtomicInteger f19847c;
    public final Runnable d;

    public y(AtomicInteger atomicInteger, AtomicInteger atomicInteger2, Runnable runnable, int i10) {
        this.f19845a = i10;
        this.f19846b = atomicInteger;
        this.f19847c = atomicInteger2;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f19845a) {
            case 0:
                BillingController.c(this.f19846b, this.f19847c, this.d);
                return;
            case 1:
                BillingController.g(this.f19846b, this.f19847c, this.d);
                return;
            default:
                BillingController.d(this.f19846b, this.f19847c, this.d);
                return;
        }
    }
}
