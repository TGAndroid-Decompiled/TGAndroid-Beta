package org.telegram.messenger;
public final class e0 implements Runnable {
    public final int f17708a;
    public final org.telegram.ui.ActionBar.b2[] f17709b;

    public e0(org.telegram.ui.ActionBar.b2[] b2VarArr, int i10) {
        this.f17708a = i10;
        this.f17709b = b2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f17708a) {
            case 0:
                BillingController.lambda$onPurchasesUpdatedInternal$6(this.f17709b);
                return;
            default:
                BillingController.lambda$onPurchasesUpdatedInternal$5(this.f17709b);
                return;
        }
    }
}
