package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;
public final class f8 implements Runnable {
    public final int f16352a;
    public final MediaDataController f16353b;
    public final TLObject f16354c;
    public final SharedPreferences d;

    public f8(MediaDataController mediaDataController, TLObject tLObject, SharedPreferences sharedPreferences, int i10) {
        this.f16352a = i10;
        this.f16353b = mediaDataController;
        this.f16354c = tLObject;
        this.d = sharedPreferences;
    }

    @Override
    public final void run() {
        switch (this.f16352a) {
            case 0:
                this.f16353b.lambda$loadRestrictedStatusEmojis$245(this.f16354c, this.d);
                return;
            default:
                this.f16353b.lambda$loadReplyIcons$243(this.f16354c, this.d);
                return;
        }
    }
}
