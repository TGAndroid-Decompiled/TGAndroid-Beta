package org.telegram.messenger;

import org.telegram.ui.ActionBar.AlertDialog;

public final class BillingController$$ExternalSyntheticLambda4 implements Runnable {
    public final int $r8$classId;
    public final AlertDialog[] f$0;

    public BillingController$$ExternalSyntheticLambda4(AlertDialog[] alertDialogArr, int i) {
        this.$r8$classId = i;
        this.f$0 = alertDialogArr;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                BillingController.lambda$onPurchasesUpdatedInternal$6(this.f$0);
                break;
            default:
                BillingController.lambda$onPurchasesUpdatedInternal$5(this.f$0);
                break;
        }
    }
}
