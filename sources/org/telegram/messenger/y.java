package org.telegram.messenger;

import java.util.concurrent.atomic.AtomicInteger;
public final class y implements Runnable {
    public final int f20108a;
    public final AtomicInteger f20109b;
    public final AtomicInteger f20110c;
    public final Runnable d;

    public y(AtomicInteger atomicInteger, AtomicInteger atomicInteger2, Runnable runnable, int i10) {
        this.f20108a = i10;
        this.f20109b = atomicInteger;
        this.f20110c = atomicInteger2;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f20108a) {
            case 0:
                BillingController.c(this.f20109b, this.f20110c, this.d);
                return;
            case 1:
                BillingController.g(this.f20109b, this.f20110c, this.d);
                return;
            default:
                BillingController.d(this.f20109b, this.f20110c, this.d);
                return;
        }
    }
}
