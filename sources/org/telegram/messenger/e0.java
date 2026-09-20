package org.telegram.messenger;
public final class e0 implements Runnable {
    public final int f16226a;
    public final org.telegram.ui.ActionBar.b2[] f16227b;

    public e0(org.telegram.ui.ActionBar.b2[] b2VarArr, int i10) {
        this.f16226a = i10;
        this.f16227b = b2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f16226a) {
            case 0:
                BillingController.lambda$onPurchasesUpdatedInternal$6(this.f16227b);
                return;
            default:
                BillingController.lambda$onPurchasesUpdatedInternal$5(this.f16227b);
                return;
        }
    }
}
