package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;
public final class f8 implements Runnable {
    public final int f16094a;
    public final MediaDataController f16095b;
    public final TLObject f16096c;
    public final SharedPreferences d;

    public f8(MediaDataController mediaDataController, TLObject tLObject, SharedPreferences sharedPreferences, int i10) {
        this.f16094a = i10;
        this.f16095b = mediaDataController;
        this.f16096c = tLObject;
        this.d = sharedPreferences;
    }

    @Override
    public final void run() {
        switch (this.f16094a) {
            case 0:
                this.f16095b.lambda$loadRestrictedStatusEmojis$245(this.f16096c, this.d);
                return;
            default:
                this.f16095b.lambda$loadReplyIcons$243(this.f16096c, this.d);
                return;
        }
    }
}
