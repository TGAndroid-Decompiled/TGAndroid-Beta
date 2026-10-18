package ai;

import org.telegram.messenger.AndroidUtilities;
public final class g8 implements Runnable {
    public final int f1349a;
    public final tc f1350b;

    public g8(tc tcVar, int i10) {
        this.f1349a = i10;
        this.f1350b = tcVar;
    }

    @Override
    public final void run() {
        switch (this.f1349a) {
            case 0:
                AndroidUtilities.runOnUIThread(new g8(this.f1350b, 3));
                return;
            case 1:
                this.f1350b.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 2:
                this.f1350b.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            default:
                this.f1350b.run(Boolean.FALSE, null);
                return;
        }
    }
}
