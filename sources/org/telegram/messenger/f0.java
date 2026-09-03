package org.telegram.messenger;
public final class f0 implements Runnable {
    public final int f17154a;
    public final org.telegram.ui.ActionBar.d2[] f17155b;

    public f0(org.telegram.ui.ActionBar.d2[] d2VarArr, int i10) {
        this.f17154a = i10;
        this.f17155b = d2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f17154a) {
            case 0:
                BillingController.lambda$onPurchasesUpdatedInternal$6(this.f17155b);
                return;
            default:
                BillingController.lambda$onPurchasesUpdatedInternal$5(this.f17155b);
                return;
        }
    }
}
