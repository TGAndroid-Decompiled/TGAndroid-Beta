package org.telegram.messenger;
public final class e0 implements Runnable {
    public final int f16262a;
    public final org.telegram.ui.ActionBar.a2[] f16263b;

    public e0(org.telegram.ui.ActionBar.a2[] a2VarArr, int i10) {
        this.f16262a = i10;
        this.f16263b = a2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f16262a) {
            case 0:
                BillingController.lambda$onPurchasesUpdatedInternal$6(this.f16263b);
                return;
            default:
                BillingController.lambda$onPurchasesUpdatedInternal$5(this.f16263b);
                return;
        }
    }
}
