package org.telegram.messenger;
public final class y implements Runnable {
    public final int f18165a;
    public final BillingController f18166b;

    public y(BillingController billingController, int i10) {
        this.f18165a = i10;
        this.f18166b = billingController;
    }

    @Override
    public final void run() {
        switch (this.f18165a) {
            case 0:
                this.f18166b.lambda$onQueriedPremiumProductDetails$14();
                return;
            default:
                this.f18166b.lambda$onBillingServiceDisconnected$13();
                return;
        }
    }
}
