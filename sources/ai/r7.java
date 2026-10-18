package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
public final class r7 implements Runnable {
    public final int f2109a;
    public final Utilities.Callback2 f2110b;

    public r7(int i10, Utilities.Callback2 callback2) {
        this.f2109a = i10;
        this.f2110b = callback2;
    }

    @Override
    public final void run() {
        switch (this.f2109a) {
            case 0:
                FileLog.d("StarsController.buy onCanceled");
                AndroidUtilities.runOnUIThread(new r7(1, this.f2110b));
                return;
            case 1:
                this.f2110b.run(Boolean.FALSE, null);
                return;
            case 2:
                this.f2110b.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            default:
                this.f2110b.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
        }
    }
}
