package org.telegram.messenger;
public final class f0 implements Runnable {
    public final int f18318a;
    public final org.telegram.ui.ActionBar.b2[] f18319b;

    public f0(org.telegram.ui.ActionBar.b2[] b2VarArr, int i10) {
        this.f18318a = i10;
        this.f18319b = b2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f18318a) {
            case 0:
                BillingController.lambda$onPurchasesUpdatedInternal$6(this.f18319b);
                return;
            default:
                BillingController.lambda$onPurchasesUpdatedInternal$5(this.f18319b);
                return;
        }
    }
}
