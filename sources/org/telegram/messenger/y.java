package org.telegram.messenger;
public final class y implements Runnable {
    public final int f18154a;
    public final BillingController f18155b;

    public y(BillingController billingController, int i10) {
        this.f18154a = i10;
        this.f18155b = billingController;
    }

    @Override
    public final void run() {
        switch (this.f18154a) {
            case 0:
                BillingController.p(this.f18155b);
                return;
            default:
                BillingController.m(this.f18155b);
                return;
        }
    }
}
