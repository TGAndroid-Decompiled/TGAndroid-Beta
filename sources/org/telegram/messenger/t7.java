package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;
public final class t7 implements Runnable {
    public final int f17598a;
    public final MediaDataController f17599b;
    public final TLObject f17600c;
    public final SharedPreferences d;

    public t7(MediaDataController mediaDataController, TLObject tLObject, SharedPreferences sharedPreferences, int i10) {
        this.f17598a = i10;
        this.f17599b = mediaDataController;
        this.f17600c = tLObject;
        this.d = sharedPreferences;
    }

    @Override
    public final void run() {
        switch (this.f17598a) {
            case 0:
                this.f17599b.lambda$loadRestrictedStatusEmojis$246(this.f17600c, this.d);
                return;
            default:
                this.f17599b.lambda$loadReplyIcons$244(this.f17600c, this.d);
                return;
        }
    }
}
