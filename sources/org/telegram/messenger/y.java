package org.telegram.messenger;
public final class y implements Runnable {
    public final int f17017a;
    public final BillingController f17018b;

    public y(BillingController billingController, int i10) {
        this.f17017a = i10;
        this.f17018b = billingController;
    }

    @Override
    public final void run() {
        switch (this.f17017a) {
            case 0:
                this.f17018b.lambda$onQueriedPremiumProductDetails$14();
                return;
            default:
                this.f17018b.lambda$onBillingServiceDisconnected$13();
                return;
        }
    }
}
