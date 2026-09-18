package org.telegram.messenger;
public final class e0 implements Runnable {
    public final int f16007a;
    public final org.telegram.ui.ActionBar.c2[] f16008b;

    public e0(org.telegram.ui.ActionBar.c2[] c2VarArr, int i10) {
        this.f16007a = i10;
        this.f16008b = c2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f16007a) {
            case 0:
                BillingController.lambda$onPurchasesUpdatedInternal$6(this.f16008b);
                return;
            default:
                BillingController.lambda$onPurchasesUpdatedInternal$5(this.f16008b);
                return;
        }
    }
}
