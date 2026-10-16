package org.telegram.messenger;
public final class f0 implements Runnable {
    public final int f16898a;
    public final org.telegram.ui.ActionBar.a2[] f16899b;

    public f0(org.telegram.ui.ActionBar.a2[] a2VarArr, int i10) {
        this.f16898a = i10;
        this.f16899b = a2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f16898a) {
            case 0:
                BillingController.lambda$onPurchasesUpdatedInternal$6(this.f16899b);
                return;
            default:
                BillingController.lambda$onPurchasesUpdatedInternal$5(this.f16899b);
                return;
        }
    }
}
