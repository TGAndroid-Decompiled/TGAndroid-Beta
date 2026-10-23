package org.telegram.messenger;
public final class f0 implements Runnable {
    public final int f18390a;
    public final org.telegram.ui.ActionBar.c2[] f18391b;

    public f0(org.telegram.ui.ActionBar.c2[] c2VarArr, int i10) {
        this.f18390a = i10;
        this.f18391b = c2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f18390a) {
            case 0:
                BillingController.lambda$onPurchasesUpdatedInternal$6(this.f18391b);
                return;
            default:
                BillingController.lambda$onPurchasesUpdatedInternal$5(this.f18391b);
                return;
        }
    }
}
