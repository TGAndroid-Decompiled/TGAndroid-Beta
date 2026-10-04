package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;
public final class t7 implements Runnable {
    public final int f19220a;
    public final MediaDataController f19221b;
    public final TLObject f19222c;
    public final SharedPreferences d;

    public t7(MediaDataController mediaDataController, TLObject tLObject, SharedPreferences sharedPreferences, int i10) {
        this.f19220a = i10;
        this.f19221b = mediaDataController;
        this.f19222c = tLObject;
        this.d = sharedPreferences;
    }

    @Override
    public final void run() {
        switch (this.f19220a) {
            case 0:
                this.f19221b.lambda$loadRestrictedStatusEmojis$246(this.f19222c, this.d);
                return;
            default:
                this.f19221b.lambda$loadReplyIcons$244(this.f19222c, this.d);
                return;
        }
    }
}
