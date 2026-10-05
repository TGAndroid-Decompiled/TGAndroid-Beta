package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;
public final class t7 implements Runnable {
    public final int f19225a;
    public final MediaDataController f19226b;
    public final TLObject f19227c;
    public final SharedPreferences d;

    public t7(MediaDataController mediaDataController, TLObject tLObject, SharedPreferences sharedPreferences, int i10) {
        this.f19225a = i10;
        this.f19226b = mediaDataController;
        this.f19227c = tLObject;
        this.d = sharedPreferences;
    }

    @Override
    public final void run() {
        switch (this.f19225a) {
            case 0:
                this.f19226b.lambda$loadRestrictedStatusEmojis$246(this.f19227c, this.d);
                return;
            default:
                this.f19226b.lambda$loadReplyIcons$244(this.f19227c, this.d);
                return;
        }
    }
}
