package org.telegram.messenger;
public final class g0 implements Runnable {
    public final int f18407a;
    public final org.telegram.ui.ActionBar.b2[] f18408b;

    public g0(org.telegram.ui.ActionBar.b2[] b2VarArr, int i10) {
        this.f18407a = i10;
        this.f18408b = b2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f18407a) {
            case 0:
                BillingController.lambda$onPurchasesUpdatedInternal$6(this.f18408b);
                return;
            default:
                BillingController.lambda$onPurchasesUpdatedInternal$5(this.f18408b);
                return;
        }
    }
}
