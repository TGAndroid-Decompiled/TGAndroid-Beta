package org.telegram.messenger;
public final class y implements Runnable {
    public final int f19845a;
    public final BillingController f19846b;

    public y(BillingController billingController, int i10) {
        this.f19845a = i10;
        this.f19846b = billingController;
    }

    @Override
    public final void run() {
        switch (this.f19845a) {
            case 0:
                BillingController.p(this.f19846b);
                return;
            default:
                BillingController.m(this.f19846b);
                return;
        }
    }
}
