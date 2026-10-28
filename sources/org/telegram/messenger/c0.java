package org.telegram.messenger;
public final class c0 implements Runnable {
    public final int f19746a;
    public final BillingController f19747b;

    public c0(BillingController billingController, int i10) {
        this.f19746a = i10;
        this.f19747b = billingController;
    }

    @Override
    public final void run() {
        switch (this.f19746a) {
            case 0:
                this.f19747b.lambda$onQueriedPremiumProductDetails$14();
                return;
            default:
                this.f19747b.lambda$onBillingServiceDisconnected$13();
                return;
        }
    }
}
