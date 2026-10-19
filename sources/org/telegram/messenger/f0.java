package org.telegram.messenger;
public final class f0 implements Runnable {
    public final int f18312a;
    public final org.telegram.ui.ActionBar.b2[] f18313b;

    public f0(org.telegram.ui.ActionBar.b2[] b2VarArr, int i10) {
        this.f18312a = i10;
        this.f18313b = b2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f18312a) {
            case 0:
                BillingController.lambda$onPurchasesUpdatedInternal$6(this.f18313b);
                return;
            default:
                BillingController.lambda$onPurchasesUpdatedInternal$5(this.f18313b);
                return;
        }
    }
}
