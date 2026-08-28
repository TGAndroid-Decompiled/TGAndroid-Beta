package org.telegram.messenger;
public final class e0 implements Runnable {
    public final int f20139a;
    public final org.telegram.ui.ActionBar.c2[] f20140b;

    public e0(org.telegram.ui.ActionBar.c2[] c2VarArr, int i9) {
        this.f20139a = i9;
        this.f20140b = c2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f20139a) {
            case 0:
                BillingController.lambda$onPurchasesUpdatedInternal$6(this.f20140b);
                return;
            default:
                BillingController.lambda$onPurchasesUpdatedInternal$5(this.f20140b);
                return;
        }
    }
}
