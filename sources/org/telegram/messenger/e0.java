package org.telegram.messenger;
public final class e0 implements Runnable {
    public final int f16246a;
    public final org.telegram.ui.ActionBar.a2[] f16247b;

    public e0(org.telegram.ui.ActionBar.a2[] a2VarArr, int i10) {
        this.f16246a = i10;
        this.f16247b = a2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f16246a) {
            case 0:
                BillingController.lambda$onPurchasesUpdatedInternal$6(this.f16247b);
                return;
            default:
                BillingController.lambda$onPurchasesUpdatedInternal$5(this.f16247b);
                return;
        }
    }
}
