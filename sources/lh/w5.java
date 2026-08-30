package lh;

import org.telegram.messenger.AndroidUtilities;
public final class w5 implements Runnable {
    public final int f13293a;
    public final dh.v f13294b;

    public w5(dh.v vVar, int i10) {
        this.f13293a = i10;
        this.f13294b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f13293a) {
            case 0:
                this.f13294b.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 1:
                this.f13294b.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new w5(this.f13294b, 3));
                return;
            default:
                this.f13294b.run(Boolean.FALSE, null);
                return;
        }
    }
}
