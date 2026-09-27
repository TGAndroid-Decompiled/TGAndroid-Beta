package org.telegram.messenger;
public final class e0 implements Runnable {
    public final int f16232a;
    public final org.telegram.ui.ActionBar.c2[] f16233b;

    public e0(org.telegram.ui.ActionBar.c2[] c2VarArr, int i10) {
        this.f16232a = i10;
        this.f16233b = c2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f16232a) {
            case 0:
                BillingController.lambda$onPurchasesUpdatedInternal$6(this.f16233b);
                return;
            default:
                BillingController.lambda$onPurchasesUpdatedInternal$5(this.f16233b);
                return;
        }
    }
}
