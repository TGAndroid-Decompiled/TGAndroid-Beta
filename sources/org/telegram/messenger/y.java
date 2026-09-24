package org.telegram.messenger;
public final class y implements Runnable {
    public final int f18145a;
    public final BillingController f18146b;

    public y(BillingController billingController, int i10) {
        this.f18145a = i10;
        this.f18146b = billingController;
    }

    @Override
    public final void run() {
        switch (this.f18145a) {
            case 0:
                BillingController.p(this.f18146b);
                return;
            default:
                BillingController.m(this.f18146b);
                return;
        }
    }
}
