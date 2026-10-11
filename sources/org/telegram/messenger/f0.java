package org.telegram.messenger;
public final class f0 implements Runnable {
    public final int f17798a;
    public final org.telegram.ui.ActionBar.a2[] f17799b;

    public f0(org.telegram.ui.ActionBar.a2[] a2VarArr, int i10) {
        this.f17798a = i10;
        this.f17799b = a2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f17798a) {
            case 0:
                BillingController.lambda$onPurchasesUpdatedInternal$6(this.f17799b);
                return;
            default:
                BillingController.lambda$onPurchasesUpdatedInternal$5(this.f17799b);
                return;
        }
    }
}
