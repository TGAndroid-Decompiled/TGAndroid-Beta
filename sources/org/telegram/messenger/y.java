package org.telegram.messenger;
public final class y implements Runnable {
    public final int f18163a;
    public final BillingController f18164b;

    public y(BillingController billingController, int i10) {
        this.f18163a = i10;
        this.f18164b = billingController;
    }

    @Override
    public final void run() {
        switch (this.f18163a) {
            case 0:
                BillingController.p(this.f18164b);
                return;
            default:
                BillingController.m(this.f18164b);
                return;
        }
    }
}
