package org.telegram.messenger;
public final class f0 implements Runnable {
    public final int f18380a;
    public final org.telegram.ui.ActionBar.c2[] f18381b;

    public f0(org.telegram.ui.ActionBar.c2[] c2VarArr, int i10) {
        this.f18380a = i10;
        this.f18381b = c2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f18380a) {
            case 0:
                BillingController.lambda$onPurchasesUpdatedInternal$6(this.f18381b);
                return;
            default:
                BillingController.lambda$onPurchasesUpdatedInternal$5(this.f18381b);
                return;
        }
    }
}
