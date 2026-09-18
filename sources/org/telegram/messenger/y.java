package org.telegram.messenger;
public final class y implements Runnable {
    public final int f17924a;
    public final BillingController f17925b;

    public y(BillingController billingController, int i10) {
        this.f17924a = i10;
        this.f17925b = billingController;
    }

    @Override
    public final void run() {
        switch (this.f17924a) {
            case 0:
                this.f17925b.lambda$onQueriedPremiumProductDetails$14();
                return;
            default:
                this.f17925b.lambda$onBillingServiceDisconnected$13();
                return;
        }
    }
}
