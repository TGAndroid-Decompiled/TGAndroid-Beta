package org.telegram.messenger;

import java.util.concurrent.atomic.AtomicInteger;

public final class y implements Runnable {

    public final int f22184a;

    public final AtomicInteger f22185b;

    public final AtomicInteger f22186c;
    public final Runnable d;

    public y(AtomicInteger atomicInteger, AtomicInteger atomicInteger2, Runnable runnable, int i10) {
        this.f22184a = i10;
        this.f22185b = atomicInteger;
        this.f22186c = atomicInteger2;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f22184a) {
            case 0:
                BillingController.lambda$onPurchasesUpdatedInternal$11(this.f22185b, this.f22186c, this.d);
                break;
            case 1:
                BillingController.lambda$onPurchasesUpdatedInternal$8(this.f22185b, this.f22186c, this.d);
                break;
            default:
                BillingController.lambda$onPurchasesUpdatedInternal$9(this.f22185b, this.f22186c, this.d);
                break;
        }
    }
}
