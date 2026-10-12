package org.telegram.messenger;
public final class a0 implements Runnable {
    public final int f17030a;
    public final BillingController f17031b;

    public a0(BillingController billingController, int i10) {
        this.f17030a = i10;
        this.f17031b = billingController;
    }

    @Override
    public final void run() {
        switch (this.f17030a) {
            case 0:
                BillingController.p(this.f17031b);
                return;
            default:
                BillingController.m(this.f17031b);
                return;
        }
    }
}
