package org.telegram.messenger;
public final class f0 implements Runnable {
    public final int f17834a;
    public final org.telegram.ui.ActionBar.a2[] f17835b;

    public f0(org.telegram.ui.ActionBar.a2[] a2VarArr, int i10) {
        this.f17834a = i10;
        this.f17835b = a2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f17834a) {
            case 0:
                BillingController.lambda$onPurchasesUpdatedInternal$6(this.f17835b);
                return;
            default:
                BillingController.lambda$onPurchasesUpdatedInternal$5(this.f17835b);
                return;
        }
    }
}
