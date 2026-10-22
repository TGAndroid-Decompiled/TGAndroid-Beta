package org.telegram.messenger;

import java.util.concurrent.atomic.AtomicInteger;
public final class y implements Runnable {
    public final int f20107a;
    public final AtomicInteger f20108b;
    public final AtomicInteger f20109c;
    public final Runnable d;

    public y(AtomicInteger atomicInteger, AtomicInteger atomicInteger2, Runnable runnable, int i10) {
        this.f20107a = i10;
        this.f20108b = atomicInteger;
        this.f20109c = atomicInteger2;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f20107a) {
            case 0:
                BillingController.c(this.f20108b, this.f20109c, this.d);
                return;
            case 1:
                BillingController.g(this.f20108b, this.f20109c, this.d);
                return;
            default:
                BillingController.d(this.f20108b, this.f20109c, this.d);
                return;
        }
    }
}
