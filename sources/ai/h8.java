package ai;

import org.telegram.messenger.AndroidUtilities;
public final class h8 implements Runnable {
    public final int f1428a;
    public final tc f1429b;

    public h8(tc tcVar, int i10) {
        this.f1428a = i10;
        this.f1429b = tcVar;
    }

    @Override
    public final void run() {
        switch (this.f1428a) {
            case 0:
                AndroidUtilities.runOnUIThread(new h8(this.f1429b, 3));
                return;
            case 1:
                this.f1429b.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 2:
                this.f1429b.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            default:
                this.f1429b.run(Boolean.FALSE, null);
                return;
        }
    }
}
