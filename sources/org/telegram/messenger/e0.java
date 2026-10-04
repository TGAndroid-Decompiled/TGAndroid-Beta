package org.telegram.messenger;
public final class e0 implements Runnable {
    public final int f17709a;
    public final org.telegram.ui.ActionBar.b2[] f17710b;

    public e0(org.telegram.ui.ActionBar.b2[] b2VarArr, int i10) {
        this.f17709a = i10;
        this.f17710b = b2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f17709a) {
            case 0:
                BillingController.lambda$onPurchasesUpdatedInternal$6(this.f17710b);
                return;
            default:
                BillingController.lambda$onPurchasesUpdatedInternal$5(this.f17710b);
                return;
        }
    }
}
