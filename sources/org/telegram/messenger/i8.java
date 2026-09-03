package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;
public final class i8 implements Runnable {
    public final int f17446a;
    public final MediaDataController f17447b;
    public final TLObject f17448c;
    public final SharedPreferences d;

    public i8(MediaDataController mediaDataController, TLObject tLObject, SharedPreferences sharedPreferences, int i10) {
        this.f17446a = i10;
        this.f17447b = mediaDataController;
        this.f17448c = tLObject;
        this.d = sharedPreferences;
    }

    @Override
    public final void run() {
        switch (this.f17446a) {
            case 0:
                this.f17447b.lambda$loadRestrictedStatusEmojis$245(this.f17448c, this.d);
                return;
            default:
                this.f17447b.lambda$loadReplyIcons$243(this.f17448c, this.d);
                return;
        }
    }
}
