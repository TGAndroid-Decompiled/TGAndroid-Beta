package org.telegram.messenger;
public final class y implements Runnable {
    public final int f18155a;
    public final BillingController f18156b;

    public y(BillingController billingController, int i10) {
        this.f18155a = i10;
        this.f18156b = billingController;
    }

    @Override
    public final void run() {
        switch (this.f18155a) {
            case 0:
                this.f18156b.lambda$onQueriedPremiumProductDetails$14();
                return;
            default:
                this.f18156b.lambda$onBillingServiceDisconnected$13();
                return;
        }
    }
}
