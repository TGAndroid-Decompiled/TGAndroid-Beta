package org.telegram.messenger;
public final class y implements Runnable {
    public final int f17904a;
    public final BillingController f17905b;

    public y(BillingController billingController, int i10) {
        this.f17904a = i10;
        this.f17905b = billingController;
    }

    @Override
    public final void run() {
        switch (this.f17904a) {
            case 0:
                this.f17905b.lambda$onQueriedPremiumProductDetails$14();
                return;
            default:
                this.f17905b.lambda$onBillingServiceDisconnected$13();
                return;
        }
    }
}
