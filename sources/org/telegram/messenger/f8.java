package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;
public final class f8 implements Runnable {
    public final int f17632a;
    public final MediaDataController f17633b;
    public final TLObject f17634c;
    public final SharedPreferences d;

    public f8(MediaDataController mediaDataController, TLObject tLObject, SharedPreferences sharedPreferences, int i10) {
        this.f17632a = i10;
        this.f17633b = mediaDataController;
        this.f17634c = tLObject;
        this.d = sharedPreferences;
    }

    @Override
    public final void run() {
        switch (this.f17632a) {
            case 0:
                this.f17633b.lambda$loadRestrictedStatusEmojis$245(this.f17634c, this.d);
                return;
            default:
                this.f17633b.lambda$loadReplyIcons$243(this.f17634c, this.d);
                return;
        }
    }
}
