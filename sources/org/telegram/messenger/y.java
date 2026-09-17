package org.telegram.messenger;
public final class y implements Runnable {
    public final int f19682a;
    public final BillingController f19683b;

    public y(BillingController billingController, int i10) {
        this.f19682a = i10;
        this.f19683b = billingController;
    }

    @Override
    public final void run() {
        switch (this.f19682a) {
            case 0:
                this.f19683b.lambda$onQueriedPremiumProductDetails$14();
                return;
            default:
                this.f19683b.lambda$onBillingServiceDisconnected$13();
                return;
        }
    }
}
