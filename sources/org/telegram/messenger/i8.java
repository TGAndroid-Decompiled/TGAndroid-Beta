package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;
public final class i8 implements Runnable {
    public final int f18939a;
    public final MediaDataController f18940b;
    public final TLObject f18941c;
    public final SharedPreferences d;

    public i8(MediaDataController mediaDataController, TLObject tLObject, SharedPreferences sharedPreferences, int i10) {
        this.f18939a = i10;
        this.f18940b = mediaDataController;
        this.f18941c = tLObject;
        this.d = sharedPreferences;
    }

    @Override
    public final void run() {
        switch (this.f18939a) {
            case 0:
                this.f18940b.lambda$loadRestrictedStatusEmojis$245(this.f18941c, this.d);
                return;
            default:
                this.f18940b.lambda$loadReplyIcons$243(this.f18941c, this.d);
                return;
        }
    }
}
