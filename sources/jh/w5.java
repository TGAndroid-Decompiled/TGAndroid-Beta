package jh;

import org.telegram.messenger.AndroidUtilities;
public final class w5 implements Runnable {
    public final int f13025a;
    public final bh.v f13026b;

    public w5(bh.v vVar, int i10) {
        this.f13025a = i10;
        this.f13026b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f13025a) {
            case 0:
                this.f13026b.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 1:
                this.f13026b.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new w5(this.f13026b, 3));
                return;
            default:
                this.f13026b.run(Boolean.FALSE, null);
                return;
        }
    }
}
