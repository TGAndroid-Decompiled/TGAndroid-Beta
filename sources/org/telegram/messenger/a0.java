package org.telegram.messenger;
public final class a0 implements Runnable {
    public final int f16697a;
    public final BillingController f16698b;

    public a0(BillingController billingController, int i10) {
        this.f16697a = i10;
        this.f16698b = billingController;
    }

    @Override
    public final void run() {
        switch (this.f16697a) {
            case 0:
                BillingController.p(this.f16698b);
                return;
            default:
                BillingController.m(this.f16698b);
                return;
        }
    }
}
