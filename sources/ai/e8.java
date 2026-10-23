package ai;

import org.telegram.messenger.AndroidUtilities;
public final class e8 implements Runnable {
    public final int f1218a;
    public final org.telegram.ui.Wallet.r1 f1219b;

    public e8(org.telegram.ui.Wallet.r1 r1Var, int i10) {
        this.f1218a = i10;
        this.f1219b = r1Var;
    }

    @Override
    public final void run() {
        switch (this.f1218a) {
            case 0:
                this.f1219b.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 1:
                this.f1219b.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new e8(this.f1219b, 3));
                return;
            default:
                this.f1219b.run(Boolean.FALSE, null);
                return;
        }
    }
}
