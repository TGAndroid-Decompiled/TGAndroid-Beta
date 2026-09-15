package org.telegram.messenger;
public final class e0 implements Runnable {
    public final int f15998a;
    public final org.telegram.ui.ActionBar.b2[] f15999b;

    public e0(org.telegram.ui.ActionBar.b2[] b2VarArr, int i10) {
        this.f15998a = i10;
        this.f15999b = b2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f15998a) {
            case 0:
                BillingController.lambda$onPurchasesUpdatedInternal$6(this.f15999b);
                return;
            default:
                BillingController.lambda$onPurchasesUpdatedInternal$5(this.f15999b);
                return;
        }
    }
}
