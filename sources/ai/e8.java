package ai;

import org.telegram.messenger.AndroidUtilities;
public final class e8 implements Runnable {
    public final int f1225a;
    public final org.telegram.ui.Wallet.s1 f1226b;

    public e8(org.telegram.ui.Wallet.s1 s1Var, int i10) {
        this.f1225a = i10;
        this.f1226b = s1Var;
    }

    @Override
    public final void run() {
        switch (this.f1225a) {
            case 0:
                this.f1226b.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 1:
                this.f1226b.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new e8(this.f1226b, 3));
                return;
            default:
                this.f1226b.run(Boolean.FALSE, null);
                return;
        }
    }
}
