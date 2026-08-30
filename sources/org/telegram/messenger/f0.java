package org.telegram.messenger;
public final class f0 implements Runnable {
    public final int f17174a;
    public final org.telegram.ui.ActionBar.d2[] f17175b;

    public f0(org.telegram.ui.ActionBar.d2[] d2VarArr, int i10) {
        this.f17174a = i10;
        this.f17175b = d2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f17174a) {
            case 0:
                BillingController.lambda$onPurchasesUpdatedInternal$6(this.f17175b);
                return;
            default:
                BillingController.lambda$onPurchasesUpdatedInternal$5(this.f17175b);
                return;
        }
    }
}
