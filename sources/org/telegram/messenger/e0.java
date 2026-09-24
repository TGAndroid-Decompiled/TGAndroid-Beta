package org.telegram.messenger;
public final class e0 implements Runnable {
    public final int f16223a;
    public final org.telegram.ui.ActionBar.a2[] f16224b;

    public e0(org.telegram.ui.ActionBar.a2[] a2VarArr, int i10) {
        this.f16223a = i10;
        this.f16224b = a2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f16223a) {
            case 0:
                BillingController.lambda$onPurchasesUpdatedInternal$6(this.f16224b);
                return;
            default:
                BillingController.lambda$onPurchasesUpdatedInternal$5(this.f16224b);
                return;
        }
    }
}
