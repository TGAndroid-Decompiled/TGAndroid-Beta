package org.telegram.messenger;
public final class y implements Runnable {
    public final int f19709a;
    public final BillingController f19710b;

    public y(BillingController billingController, int i10) {
        this.f19709a = i10;
        this.f19710b = billingController;
    }

    @Override
    public final void run() {
        switch (this.f19709a) {
            case 0:
                this.f19710b.lambda$onQueriedPremiumProductDetails$14();
                return;
            default:
                this.f19710b.lambda$onBillingServiceDisconnected$13();
                return;
        }
    }
}
