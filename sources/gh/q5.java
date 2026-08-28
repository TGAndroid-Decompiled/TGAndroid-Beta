package gh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
public final class q5 implements Runnable {
    public final int f8750a;
    public final Utilities.Callback2 f8751b;

    public q5(int i9, Utilities.Callback2 callback2) {
        this.f8750a = i9;
        this.f8751b = callback2;
    }

    @Override
    public final void run() {
        switch (this.f8750a) {
            case 0:
                FileLog.d("StarsController.buy onCanceled");
                AndroidUtilities.runOnUIThread(new q5(1, this.f8751b));
                return;
            case 1:
                this.f8751b.run(Boolean.FALSE, null);
                return;
            case 2:
                this.f8751b.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            default:
                this.f8751b.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
        }
    }
}
