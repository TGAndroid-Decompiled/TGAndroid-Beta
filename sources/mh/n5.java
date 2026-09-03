package mh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
public final class n5 implements Runnable {
    public final int f14487a;
    public final Utilities.Callback2 f14488b;

    public n5(int i10, Utilities.Callback2 callback2) {
        this.f14487a = i10;
        this.f14488b = callback2;
    }

    @Override
    public final void run() {
        switch (this.f14487a) {
            case 0:
                FileLog.d("StarsController.buy onCanceled");
                AndroidUtilities.runOnUIThread(new n5(1, this.f14488b));
                return;
            case 1:
                this.f14488b.run(Boolean.FALSE, null);
                return;
            case 2:
                this.f14488b.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            default:
                this.f14488b.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
        }
    }
}
