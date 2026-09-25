package org.telegram.messenger;
public final class y implements Runnable {
    public final int f18160a;
    public final BillingController f18161b;

    public y(BillingController billingController, int i10) {
        this.f18160a = i10;
        this.f18161b = billingController;
    }

    @Override
    public final void run() {
        switch (this.f18160a) {
            case 0:
                BillingController.p(this.f18161b);
                return;
            default:
                BillingController.m(this.f18161b);
                return;
        }
    }
}
