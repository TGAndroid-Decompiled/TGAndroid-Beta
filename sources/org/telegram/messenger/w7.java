package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;
public final class w7 implements Runnable {
    public final int f19444a;
    public final MediaDataController f19445b;
    public final TLObject f19446c;
    public final SharedPreferences d;

    public w7(MediaDataController mediaDataController, TLObject tLObject, SharedPreferences sharedPreferences, int i10) {
        this.f19444a = i10;
        this.f19445b = mediaDataController;
        this.f19446c = tLObject;
        this.d = sharedPreferences;
    }

    @Override
    public final void run() {
        switch (this.f19444a) {
            case 0:
                this.f19445b.lambda$loadRestrictedStatusEmojis$246(this.f19446c, this.d);
                return;
            default:
                this.f19445b.lambda$loadReplyIcons$244(this.f19446c, this.d);
                return;
        }
    }
}
