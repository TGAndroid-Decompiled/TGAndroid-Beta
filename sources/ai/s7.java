package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
public final class s7 implements Runnable {
    public final int f2157a;
    public final Utilities.Callback2 f2158b;

    public s7(int i10, Utilities.Callback2 callback2) {
        this.f2157a = i10;
        this.f2158b = callback2;
    }

    @Override
    public final void run() {
        switch (this.f2157a) {
            case 0:
                FileLog.d("StarsController.buy onCanceled");
                AndroidUtilities.runOnUIThread(new s7(1, this.f2158b));
                return;
            case 1:
                this.f2158b.run(Boolean.FALSE, null);
                return;
            case 2:
                this.f2158b.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            default:
                this.f2158b.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
        }
    }
}
