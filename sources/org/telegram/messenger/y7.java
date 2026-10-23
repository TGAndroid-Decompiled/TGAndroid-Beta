package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;
public final class y7 implements Runnable {
    public final int f20140a;
    public final MediaDataController f20141b;
    public final TLObject f20142c;
    public final SharedPreferences d;

    public y7(MediaDataController mediaDataController, TLObject tLObject, SharedPreferences sharedPreferences, int i10) {
        this.f20140a = i10;
        this.f20141b = mediaDataController;
        this.f20142c = tLObject;
        this.d = sharedPreferences;
    }

    @Override
    public final void run() {
        switch (this.f20140a) {
            case 0:
                this.f20141b.lambda$loadRestrictedStatusEmojis$246(this.f20142c, this.d);
                return;
            default:
                this.f20141b.lambda$loadReplyIcons$244(this.f20142c, this.d);
                return;
        }
    }
}
