package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;
public final class w7 implements Runnable {
    public final int f18905a;
    public final MediaDataController f18906b;
    public final TLObject f18907c;
    public final SharedPreferences d;

    public w7(MediaDataController mediaDataController, TLObject tLObject, SharedPreferences sharedPreferences, int i10) {
        this.f18905a = i10;
        this.f18906b = mediaDataController;
        this.f18907c = tLObject;
        this.d = sharedPreferences;
    }

    @Override
    public final void run() {
        switch (this.f18905a) {
            case 0:
                this.f18906b.lambda$loadRestrictedStatusEmojis$246(this.f18907c, this.d);
                return;
            default:
                this.f18906b.lambda$loadReplyIcons$244(this.f18907c, this.d);
                return;
        }
    }
}
