package org.telegram.messenger;
public final class y implements Runnable {
    public final int f17915a;
    public final BillingController f17916b;

    public y(BillingController billingController, int i10) {
        this.f17915a = i10;
        this.f17916b = billingController;
    }

    @Override
    public final void run() {
        switch (this.f17915a) {
            case 0:
                this.f17916b.lambda$onQueriedPremiumProductDetails$14();
                return;
            default:
                this.f17916b.lambda$onBillingServiceDisconnected$13();
                return;
        }
    }
}
