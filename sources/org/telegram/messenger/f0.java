package org.telegram.messenger;
public final class f0 implements Runnable {
    public final int f16259a;
    public final org.telegram.ui.ActionBar.b2[] f16260b;

    public f0(org.telegram.ui.ActionBar.b2[] b2VarArr, int i10) {
        this.f16259a = i10;
        this.f16260b = b2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f16259a) {
            case 0:
                BillingController.lambda$onPurchasesUpdatedInternal$6(this.f16260b);
                return;
            default:
                BillingController.lambda$onPurchasesUpdatedInternal$5(this.f16260b);
                return;
        }
    }
}
