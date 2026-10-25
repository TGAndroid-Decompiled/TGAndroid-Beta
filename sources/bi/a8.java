package bi;

import org.telegram.messenger.AndroidUtilities;
public final class a8 implements Runnable {
    public final int f4264a;
    public final org.telegram.ui.Wallet.r1 f4265b;

    public a8(org.telegram.ui.Wallet.r1 r1Var, int i10) {
        this.f4264a = i10;
        this.f4265b = r1Var;
    }

    @Override
    public final void run() {
        switch (this.f4264a) {
            case 0:
                this.f4265b.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 1:
                this.f4265b.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new a8(this.f4265b, 3));
                return;
            default:
                this.f4265b.run(Boolean.FALSE, null);
                return;
        }
    }
}
