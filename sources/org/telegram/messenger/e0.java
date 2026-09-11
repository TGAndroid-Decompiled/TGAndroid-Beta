package org.telegram.messenger;
public final class e0 implements Runnable {
    public final int f17522a;
    public final org.telegram.ui.ActionBar.b2[] f17523b;

    public e0(org.telegram.ui.ActionBar.b2[] b2VarArr, int i10) {
        this.f17522a = i10;
        this.f17523b = b2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f17522a) {
            case 0:
                BillingController.lambda$onPurchasesUpdatedInternal$6(this.f17523b);
                return;
            default:
                BillingController.lambda$onPurchasesUpdatedInternal$5(this.f17523b);
                return;
        }
    }
}
