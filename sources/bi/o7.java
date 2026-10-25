package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
public final class o7 implements Runnable {
    public final int f5196a;
    public final Utilities.Callback2 f5197b;

    public o7(int i10, Utilities.Callback2 callback2) {
        this.f5196a = i10;
        this.f5197b = callback2;
    }

    @Override
    public final void run() {
        switch (this.f5196a) {
            case 0:
                FileLog.d("StarsController.buy onCanceled");
                AndroidUtilities.runOnUIThread(new o7(1, this.f5197b));
                return;
            case 1:
                this.f5197b.run(Boolean.FALSE, null);
                return;
            case 2:
                this.f5197b.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            default:
                this.f5197b.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
        }
    }
}
