package mh;

import org.telegram.messenger.AndroidUtilities;
public final class w5 implements Runnable {
    public final int f14985a;
    public final eh.w f14986b;

    public w5(eh.w wVar, int i10) {
        this.f14985a = i10;
        this.f14986b = wVar;
    }

    @Override
    public final void run() {
        switch (this.f14985a) {
            case 0:
                this.f14986b.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 1:
                this.f14986b.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new w5(this.f14986b, 3));
                return;
            default:
                this.f14986b.run(Boolean.FALSE, null);
                return;
        }
    }
}
