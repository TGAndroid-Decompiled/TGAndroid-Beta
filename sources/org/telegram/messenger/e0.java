package org.telegram.messenger;
public final class e0 implements Runnable {
    public final int f15033a;
    public final org.telegram.ui.ActionBar.d2[] f15034b;

    public e0(org.telegram.ui.ActionBar.d2[] d2VarArr, int i10) {
        this.f15033a = i10;
        this.f15034b = d2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f15033a) {
            case 0:
                BillingController.lambda$onPurchasesUpdatedInternal$6(this.f15034b);
                return;
            default:
                BillingController.lambda$onPurchasesUpdatedInternal$5(this.f15034b);
                return;
        }
    }
}
