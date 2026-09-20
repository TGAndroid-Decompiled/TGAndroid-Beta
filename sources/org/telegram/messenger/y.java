package org.telegram.messenger;
public final class y implements Runnable {
    public final int f18140a;
    public final BillingController f18141b;

    public y(BillingController billingController, int i10) {
        this.f18140a = i10;
        this.f18141b = billingController;
    }

    @Override
    public final void run() {
        switch (this.f18140a) {
            case 0:
                this.f18141b.lambda$onQueriedPremiumProductDetails$14();
                return;
            default:
                this.f18141b.lambda$onBillingServiceDisconnected$13();
                return;
        }
    }
}
