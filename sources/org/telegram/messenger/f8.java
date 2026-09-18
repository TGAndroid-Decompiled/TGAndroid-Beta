package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;
public final class f8 implements Runnable {
    public final int f16286a;
    public final MediaDataController f16287b;
    public final TLObject f16288c;
    public final SharedPreferences d;

    public f8(MediaDataController mediaDataController, TLObject tLObject, SharedPreferences sharedPreferences, int i10) {
        this.f16286a = i10;
        this.f16287b = mediaDataController;
        this.f16288c = tLObject;
        this.d = sharedPreferences;
    }

    @Override
    public final void run() {
        switch (this.f16286a) {
            case 0:
                this.f16287b.lambda$loadRestrictedStatusEmojis$245(this.f16288c, this.d);
                return;
            default:
                this.f16287b.lambda$loadReplyIcons$243(this.f16288c, this.d);
                return;
        }
    }
}
