package org.telegram.messenger;
public final class y implements Runnable {
    public final int f19674a;
    public final BillingController f19675b;

    public y(BillingController billingController, int i10) {
        this.f19674a = i10;
        this.f19675b = billingController;
    }

    @Override
    public final void run() {
        switch (this.f19674a) {
            case 0:
                this.f19675b.lambda$onQueriedPremiumProductDetails$14();
                return;
            default:
                this.f19675b.lambda$onBillingServiceDisconnected$13();
                return;
        }
    }
}
