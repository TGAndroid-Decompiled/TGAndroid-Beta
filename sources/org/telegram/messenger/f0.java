package org.telegram.messenger;
public final class f0 implements Runnable {
    public final int f17800a;
    public final org.telegram.ui.ActionBar.b2[] f17801b;

    public f0(org.telegram.ui.ActionBar.b2[] b2VarArr, int i10) {
        this.f17800a = i10;
        this.f17801b = b2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f17800a) {
            case 0:
                BillingController.lambda$onPurchasesUpdatedInternal$6(this.f17801b);
                return;
            default:
                BillingController.lambda$onPurchasesUpdatedInternal$5(this.f17801b);
                return;
        }
    }
}
