package org.telegram.messenger;
public final class y implements Runnable {
    public final int f19844a;
    public final BillingController f19845b;

    public y(BillingController billingController, int i10) {
        this.f19844a = i10;
        this.f19845b = billingController;
    }

    @Override
    public final void run() {
        switch (this.f19844a) {
            case 0:
                this.f19845b.lambda$onQueriedPremiumProductDetails$14();
                return;
            default:
                this.f19845b.lambda$onBillingServiceDisconnected$13();
                return;
        }
    }
}
