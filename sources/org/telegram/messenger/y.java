package org.telegram.messenger;
public final class y implements Runnable {
    public final int f19647a;
    public final BillingController f19648b;

    public y(BillingController billingController, int i10) {
        this.f19647a = i10;
        this.f19648b = billingController;
    }

    @Override
    public final void run() {
        switch (this.f19647a) {
            case 0:
                this.f19648b.lambda$onQueriedPremiumProductDetails$14();
                return;
            default:
                this.f19648b.lambda$onBillingServiceDisconnected$13();
                return;
        }
    }
}
