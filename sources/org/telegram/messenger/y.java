package org.telegram.messenger;
public final class y implements Runnable {
    public final int f17914a;
    public final BillingController f17915b;

    public y(BillingController billingController, int i10) {
        this.f17914a = i10;
        this.f17915b = billingController;
    }

    @Override
    public final void run() {
        switch (this.f17914a) {
            case 0:
                this.f17915b.lambda$onQueriedPremiumProductDetails$14();
                return;
            default:
                this.f17915b.lambda$onBillingServiceDisconnected$13();
                return;
        }
    }
}
