package org.telegram.messenger;

public final class BillingController$$ExternalSyntheticLambda3 implements Runnable {
    public final int $r8$classId;
    public final BillingController f$0;

    public BillingController$$ExternalSyntheticLambda3(BillingController billingController, int i) {
        this.$r8$classId = i;
        this.f$0 = billingController;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onBillingServiceDisconnected$13();
                break;
            default:
                this.f$0.lambda$onQueriedPremiumProductDetails$14();
                break;
        }
    }
}
