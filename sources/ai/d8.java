package ai;

import org.telegram.messenger.AndroidUtilities;
public final class d8 implements Runnable {
    public final int f1164a;
    public final org.telegram.ui.Wallet.s1 f1165b;

    public d8(org.telegram.ui.Wallet.s1 s1Var, int i10) {
        this.f1164a = i10;
        this.f1165b = s1Var;
    }

    @Override
    public final void run() {
        switch (this.f1164a) {
            case 0:
                this.f1165b.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 1:
                this.f1165b.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new d8(this.f1165b, 3));
                return;
            default:
                this.f1165b.run(Boolean.FALSE, null);
                return;
        }
    }
}
