package org.telegram.messenger;
public final class y implements Runnable {
    public final int f18180a;
    public final BillingController f18181b;

    public y(BillingController billingController, int i10) {
        this.f18180a = i10;
        this.f18181b = billingController;
    }

    @Override
    public final void run() {
        switch (this.f18180a) {
            case 0:
                BillingController.p(this.f18181b);
                return;
            default:
                BillingController.m(this.f18181b);
                return;
        }
    }
}
