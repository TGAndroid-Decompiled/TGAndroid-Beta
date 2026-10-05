package org.telegram.messenger;
public final class f0 implements Runnable {
    public final int f17805a;
    public final org.telegram.ui.ActionBar.b2[] f17806b;

    public f0(org.telegram.ui.ActionBar.b2[] b2VarArr, int i10) {
        this.f17805a = i10;
        this.f17806b = b2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f17805a) {
            case 0:
                BillingController.lambda$onPurchasesUpdatedInternal$6(this.f17806b);
                return;
            default:
                BillingController.lambda$onPurchasesUpdatedInternal$5(this.f17806b);
                return;
        }
    }
}
