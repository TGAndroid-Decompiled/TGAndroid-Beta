package lh;

import org.telegram.messenger.AndroidUtilities;
public final class w5 implements Runnable {
    public final int f13277a;
    public final dh.v f13278b;

    public w5(dh.v vVar, int i10) {
        this.f13277a = i10;
        this.f13278b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f13277a) {
            case 0:
                this.f13278b.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 1:
                this.f13278b.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new w5(this.f13278b, 3));
                return;
            default:
                this.f13278b.run(Boolean.FALSE, null);
                return;
        }
    }
}
