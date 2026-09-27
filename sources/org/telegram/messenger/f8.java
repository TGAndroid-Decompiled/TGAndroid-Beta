package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;
public final class f8 implements Runnable {
    public final int f16349a;
    public final MediaDataController f16350b;
    public final TLObject f16351c;
    public final SharedPreferences d;

    public f8(MediaDataController mediaDataController, TLObject tLObject, SharedPreferences sharedPreferences, int i10) {
        this.f16349a = i10;
        this.f16350b = mediaDataController;
        this.f16351c = tLObject;
        this.d = sharedPreferences;
    }

    @Override
    public final void run() {
        switch (this.f16349a) {
            case 0:
                this.f16350b.lambda$loadRestrictedStatusEmojis$245(this.f16351c, this.d);
                return;
            default:
                this.f16350b.lambda$loadReplyIcons$243(this.f16351c, this.d);
                return;
        }
    }
}
