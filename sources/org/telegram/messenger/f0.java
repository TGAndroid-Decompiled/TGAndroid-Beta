package org.telegram.messenger;
public final class f0 implements Runnable {
    public final int f18618a;
    public final org.telegram.ui.ActionBar.d2[] f18619b;

    public f0(org.telegram.ui.ActionBar.d2[] d2VarArr, int i10) {
        this.f18618a = i10;
        this.f18619b = d2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f18618a) {
            case 0:
                BillingController.lambda$onPurchasesUpdatedInternal$6(this.f18619b);
                return;
            default:
                BillingController.lambda$onPurchasesUpdatedInternal$5(this.f18619b);
                return;
        }
    }
}
