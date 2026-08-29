package org.telegram.messenger;
public final class e0 implements Runnable {
    public final int f20083a;
    public final org.telegram.ui.ActionBar.c2[] f20084b;

    public e0(org.telegram.ui.ActionBar.c2[] c2VarArr, int i10) {
        this.f20083a = i10;
        this.f20084b = c2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f20083a) {
            case 0:
                BillingController.lambda$onPurchasesUpdatedInternal$6(this.f20084b);
                return;
            default:
                BillingController.lambda$onPurchasesUpdatedInternal$5(this.f20084b);
                return;
        }
    }
}
