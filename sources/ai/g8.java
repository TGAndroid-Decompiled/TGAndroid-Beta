package ai;

import org.telegram.messenger.AndroidUtilities;
public final class g8 implements Runnable {
    public final int f1368a;
    public final sc f1369b;

    public g8(sc scVar, int i10) {
        this.f1368a = i10;
        this.f1369b = scVar;
    }

    @Override
    public final void run() {
        switch (this.f1368a) {
            case 0:
                AndroidUtilities.runOnUIThread(new g8(this.f1369b, 3));
                return;
            case 1:
                this.f1369b.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 2:
                this.f1369b.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            default:
                this.f1369b.run(Boolean.FALSE, null);
                return;
        }
    }
}
