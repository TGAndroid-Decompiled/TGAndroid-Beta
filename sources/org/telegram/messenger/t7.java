package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;
public final class t7 implements Runnable {
    public final int f17597a;
    public final MediaDataController f17598b;
    public final TLObject f17599c;
    public final SharedPreferences d;

    public t7(MediaDataController mediaDataController, TLObject tLObject, SharedPreferences sharedPreferences, int i10) {
        this.f17597a = i10;
        this.f17598b = mediaDataController;
        this.f17599c = tLObject;
        this.d = sharedPreferences;
    }

    @Override
    public final void run() {
        switch (this.f17597a) {
            case 0:
                this.f17598b.lambda$loadRestrictedStatusEmojis$246(this.f17599c, this.d);
                return;
            default:
                this.f17598b.lambda$loadReplyIcons$244(this.f17599c, this.d);
                return;
        }
    }
}
