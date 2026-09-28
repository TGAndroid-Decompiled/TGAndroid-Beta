package org.telegram.messenger;
public final class y implements Runnable {
    public final int f18164a;
    public final BillingController f18165b;

    public y(BillingController billingController, int i10) {
        this.f18164a = i10;
        this.f18165b = billingController;
    }

    @Override
    public final void run() {
        switch (this.f18164a) {
            case 0:
                BillingController.p(this.f18165b);
                return;
            default:
                BillingController.m(this.f18165b);
                return;
        }
    }
}
