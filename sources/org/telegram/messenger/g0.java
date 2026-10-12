package org.telegram.messenger;
public final class g0 implements Runnable {
    public final int f17638a;
    public final org.telegram.ui.ActionBar.a2[] f17639b;

    public g0(org.telegram.ui.ActionBar.a2[] a2VarArr, int i10) {
        this.f17638a = i10;
        this.f17639b = a2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f17638a) {
            case 0:
                BillingController.lambda$onPurchasesUpdatedInternal$6(this.f17639b);
                return;
            default:
                BillingController.lambda$onPurchasesUpdatedInternal$5(this.f17639b);
                return;
        }
    }
}
