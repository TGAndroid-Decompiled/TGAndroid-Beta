package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;
public final class f8 implements Runnable {
    public final int f16337a;
    public final MediaDataController f16338b;
    public final TLObject f16339c;
    public final SharedPreferences d;

    public f8(MediaDataController mediaDataController, TLObject tLObject, SharedPreferences sharedPreferences, int i10) {
        this.f16337a = i10;
        this.f16338b = mediaDataController;
        this.f16339c = tLObject;
        this.d = sharedPreferences;
    }

    @Override
    public final void run() {
        switch (this.f16337a) {
            case 0:
                this.f16338b.lambda$loadRestrictedStatusEmojis$245(this.f16339c, this.d);
                return;
            default:
                this.f16338b.lambda$loadReplyIcons$243(this.f16339c, this.d);
                return;
        }
    }
}
