package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
public final class s7 implements Runnable {
    public final int f2154a;
    public final Utilities.Callback2 f2155b;

    public s7(int i10, Utilities.Callback2 callback2) {
        this.f2154a = i10;
        this.f2155b = callback2;
    }

    @Override
    public final void run() {
        switch (this.f2154a) {
            case 0:
                FileLog.d("StarsController.buy onCanceled");
                AndroidUtilities.runOnUIThread(new s7(1, this.f2155b));
                return;
            case 1:
                this.f2155b.run(Boolean.FALSE, null);
                return;
            case 2:
                this.f2155b.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            default:
                this.f2155b.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
        }
    }
}
