package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;
public final class f8 implements Runnable {
    public final int f16326a;
    public final MediaDataController f16327b;
    public final TLObject f16328c;
    public final SharedPreferences d;

    public f8(MediaDataController mediaDataController, TLObject tLObject, SharedPreferences sharedPreferences, int i10) {
        this.f16326a = i10;
        this.f16327b = mediaDataController;
        this.f16328c = tLObject;
        this.d = sharedPreferences;
    }

    @Override
    public final void run() {
        switch (this.f16326a) {
            case 0:
                this.f16327b.lambda$loadRestrictedStatusEmojis$245(this.f16328c, this.d);
                return;
            default:
                this.f16327b.lambda$loadReplyIcons$243(this.f16328c, this.d);
                return;
        }
    }
}
