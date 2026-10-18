package org.telegram.messenger;
public final class f0 implements Runnable {
    public final int f18309a;
    public final org.telegram.ui.ActionBar.b2[] f18310b;

    public f0(org.telegram.ui.ActionBar.b2[] b2VarArr, int i10) {
        this.f18309a = i10;
        this.f18310b = b2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f18309a) {
            case 0:
                BillingController.lambda$onPurchasesUpdatedInternal$6(this.f18310b);
                return;
            default:
                BillingController.lambda$onPurchasesUpdatedInternal$5(this.f18310b);
                return;
        }
    }
}
