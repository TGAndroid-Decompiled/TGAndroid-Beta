package org.telegram.messenger;
public final class e0 implements Runnable {
    public final int f17536a;
    public final org.telegram.ui.ActionBar.b2[] f17537b;

    public e0(org.telegram.ui.ActionBar.b2[] b2VarArr, int i10) {
        this.f17536a = i10;
        this.f17537b = b2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f17536a) {
            case 0:
                BillingController.lambda$onPurchasesUpdatedInternal$6(this.f17537b);
                return;
            default:
                BillingController.lambda$onPurchasesUpdatedInternal$5(this.f17537b);
                return;
        }
    }
}
