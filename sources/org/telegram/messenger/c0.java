package org.telegram.messenger;
public final class c0 implements Runnable {
    public final int f19740a;
    public final BillingController f19741b;

    public c0(BillingController billingController, int i10) {
        this.f19740a = i10;
        this.f19741b = billingController;
    }

    @Override
    public final void run() {
        switch (this.f19740a) {
            case 0:
                this.f19741b.lambda$onQueriedPremiumProductDetails$14();
                return;
            default:
                this.f19741b.lambda$onBillingServiceDisconnected$13();
                return;
        }
    }
}
