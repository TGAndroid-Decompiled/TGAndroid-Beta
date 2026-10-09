package org.telegram.messenger;
public final class f0 implements Runnable {
    public final int f17796a;
    public final org.telegram.ui.ActionBar.b2[] f17797b;

    public f0(org.telegram.ui.ActionBar.b2[] b2VarArr, int i10) {
        this.f17796a = i10;
        this.f17797b = b2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f17796a) {
            case 0:
                BillingController.lambda$onPurchasesUpdatedInternal$6(this.f17797b);
                return;
            default:
                BillingController.lambda$onPurchasesUpdatedInternal$5(this.f17797b);
                return;
        }
    }
}
