package ai;

import org.telegram.messenger.AndroidUtilities;
public final class g8 implements Runnable {
    public final int f1347a;
    public final tc f1348b;

    public g8(tc tcVar, int i10) {
        this.f1347a = i10;
        this.f1348b = tcVar;
    }

    @Override
    public final void run() {
        switch (this.f1347a) {
            case 0:
                AndroidUtilities.runOnUIThread(new g8(this.f1348b, 3));
                return;
            case 1:
                this.f1348b.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 2:
                this.f1348b.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            default:
                this.f1348b.run(Boolean.FALSE, null);
                return;
        }
    }
}
