package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;
public final class f8 implements Runnable {
    public final int f16108a;
    public final MediaDataController f16109b;
    public final TLObject f16110c;
    public final SharedPreferences d;

    public f8(MediaDataController mediaDataController, TLObject tLObject, SharedPreferences sharedPreferences, int i10) {
        this.f16108a = i10;
        this.f16109b = mediaDataController;
        this.f16110c = tLObject;
        this.d = sharedPreferences;
    }

    @Override
    public final void run() {
        switch (this.f16108a) {
            case 0:
                this.f16109b.lambda$loadRestrictedStatusEmojis$245(this.f16110c, this.d);
                return;
            default:
                this.f16109b.lambda$loadReplyIcons$243(this.f16110c, this.d);
                return;
        }
    }
}
