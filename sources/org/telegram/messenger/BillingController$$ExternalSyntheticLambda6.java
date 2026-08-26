package org.telegram.messenger;

import java.util.concurrent.atomic.AtomicInteger;

public final class BillingController$$ExternalSyntheticLambda6 implements Runnable {
    public final int $r8$classId;
    public final AtomicInteger f$0;
    public final AtomicInteger f$1;
    public final Runnable f$2;

    public BillingController$$ExternalSyntheticLambda6(AtomicInteger atomicInteger, AtomicInteger atomicInteger2, Runnable runnable, int i) {
        this.$r8$classId = i;
        this.f$0 = atomicInteger;
        this.f$1 = atomicInteger2;
        this.f$2 = runnable;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                BillingController.lambda$onPurchasesUpdatedInternal$8(this.f$0, this.f$1, this.f$2);
                break;
            case 1:
                BillingController.lambda$onPurchasesUpdatedInternal$11(this.f$0, this.f$1, this.f$2);
                break;
            default:
                BillingController.lambda$onPurchasesUpdatedInternal$9(this.f$0, this.f$1, this.f$2);
                break;
        }
    }
}
