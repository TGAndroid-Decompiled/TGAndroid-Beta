package org.telegram.messenger;
public final class i0 implements Runnable {
    public final int f20297a;
    public final org.telegram.ui.ActionBar.e2[] f20298b;

    public i0(org.telegram.ui.ActionBar.e2[] e2VarArr, int i10) {
        this.f20297a = i10;
        this.f20298b = e2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f20297a) {
            case 0:
                BillingController.lambda$onPurchasesUpdatedInternal$6(this.f20298b);
                return;
            default:
                BillingController.lambda$onPurchasesUpdatedInternal$5(this.f20298b);
                return;
        }
    }
}
