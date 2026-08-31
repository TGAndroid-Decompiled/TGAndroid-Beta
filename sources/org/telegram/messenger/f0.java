package org.telegram.messenger;
public final class f0 implements Runnable {
    public final int f18616a;
    public final org.telegram.ui.ActionBar.d2[] f18617b;

    public f0(org.telegram.ui.ActionBar.d2[] d2VarArr, int i10) {
        this.f18616a = i10;
        this.f18617b = d2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f18616a) {
            case 0:
                BillingController.lambda$onPurchasesUpdatedInternal$6(this.f18617b);
                return;
            default:
                BillingController.lambda$onPurchasesUpdatedInternal$5(this.f18617b);
                return;
        }
    }
}
