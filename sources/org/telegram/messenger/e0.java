package org.telegram.messenger;

public final class e0 implements Runnable {

    public final int f20093a;

    public final org.telegram.ui.ActionBar.b2[] f20094b;

    public e0(org.telegram.ui.ActionBar.b2[] b2VarArr, int i10) {
        this.f20093a = i10;
        this.f20094b = b2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f20093a) {
            case 0:
                BillingController.lambda$onPurchasesUpdatedInternal$6(this.f20094b);
                break;
            default:
                BillingController.lambda$onPurchasesUpdatedInternal$5(this.f20094b);
                break;
        }
    }
}
