package org.telegram.messenger;
public final class a0 implements Runnable {
    public final int f16734a;
    public final BillingController f16735b;

    public a0(BillingController billingController, int i10) {
        this.f16734a = i10;
        this.f16735b = billingController;
    }

    @Override
    public final void run() {
        switch (this.f16734a) {
            case 0:
                BillingController.p(this.f16735b);
                return;
            default:
                BillingController.m(this.f16735b);
                return;
        }
    }
}
