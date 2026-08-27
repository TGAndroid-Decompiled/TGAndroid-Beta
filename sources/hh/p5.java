package hh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;

public final class p5 implements Runnable {

    public final int f9873a;

    public final Utilities.Callback2 f9874b;

    public p5(int i10, Utilities.Callback2 callback2) {
        this.f9873a = i10;
        this.f9874b = callback2;
    }

    @Override
    public final void run() {
        switch (this.f9873a) {
            case 0:
                FileLog.d("StarsController.buy onCanceled");
                AndroidUtilities.runOnUIThread(new p5(1, this.f9874b));
                break;
            case 1:
                this.f9874b.run(Boolean.FALSE, null);
                break;
            case 2:
                this.f9874b.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                break;
            default:
                this.f9874b.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                break;
        }
    }
}
