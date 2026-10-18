package org.telegram.messenger;
public final class f0 implements Runnable {
    public final int f18334a;
    public final org.telegram.ui.ActionBar.b2[] f18335b;

    public f0(org.telegram.ui.ActionBar.b2[] b2VarArr, int i10) {
        this.f18334a = i10;
        this.f18335b = b2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f18334a) {
            case 0:
                BillingController.lambda$onPurchasesUpdatedInternal$6(this.f18335b);
                return;
            default:
                BillingController.lambda$onPurchasesUpdatedInternal$5(this.f18335b);
                return;
        }
    }
}
