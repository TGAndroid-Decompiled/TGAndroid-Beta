package ai;

import org.telegram.messenger.AndroidUtilities;
public final class h8 implements Runnable {
    public final int f1408a;
    public final uc f1409b;

    public h8(uc ucVar, int i10) {
        this.f1408a = i10;
        this.f1409b = ucVar;
    }

    @Override
    public final void run() {
        switch (this.f1408a) {
            case 0:
                AndroidUtilities.runOnUIThread(new h8(this.f1409b, 3));
                return;
            case 1:
                this.f1409b.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 2:
                this.f1409b.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            default:
                this.f1409b.run(Boolean.FALSE, null);
                return;
        }
    }
}
