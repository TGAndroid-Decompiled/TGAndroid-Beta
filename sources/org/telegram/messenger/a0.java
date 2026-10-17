package org.telegram.messenger;
public final class a0 implements Runnable {
    public final int f17821a;
    public final BillingController f17822b;

    public a0(BillingController billingController, int i10) {
        this.f17821a = i10;
        this.f17822b = billingController;
    }

    @Override
    public final void run() {
        switch (this.f17821a) {
            case 0:
                BillingController.p(this.f17822b);
                return;
            default:
                BillingController.m(this.f17822b);
                return;
        }
    }
}
