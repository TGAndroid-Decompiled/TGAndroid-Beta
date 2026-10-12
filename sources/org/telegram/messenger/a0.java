package org.telegram.messenger;
public final class a0 implements Runnable {
    public final int f17029a;
    public final BillingController f17030b;

    public a0(BillingController billingController, int i10) {
        this.f17029a = i10;
        this.f17030b = billingController;
    }

    @Override
    public final void run() {
        switch (this.f17029a) {
            case 0:
                BillingController.p(this.f17030b);
                return;
            default:
                BillingController.m(this.f17030b);
                return;
        }
    }
}
