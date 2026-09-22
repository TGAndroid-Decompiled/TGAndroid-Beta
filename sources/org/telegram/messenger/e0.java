package org.telegram.messenger;
public final class e0 implements Runnable {
    public final int f16241a;
    public final org.telegram.ui.ActionBar.b2[] f16242b;

    public e0(org.telegram.ui.ActionBar.b2[] b2VarArr, int i10) {
        this.f16241a = i10;
        this.f16242b = b2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f16241a) {
            case 0:
                BillingController.lambda$onPurchasesUpdatedInternal$6(this.f16242b);
                return;
            default:
                BillingController.lambda$onPurchasesUpdatedInternal$5(this.f16242b);
                return;
        }
    }
}
