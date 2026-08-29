package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;
public final class h8 implements Runnable {
    public final int f20425a;
    public final MediaDataController f20426b;
    public final TLObject f20427c;
    public final SharedPreferences d;

    public h8(MediaDataController mediaDataController, TLObject tLObject, SharedPreferences sharedPreferences, int i10) {
        this.f20425a = i10;
        this.f20426b = mediaDataController;
        this.f20427c = tLObject;
        this.d = sharedPreferences;
    }

    @Override
    public final void run() {
        switch (this.f20425a) {
            case 0:
                this.f20426b.lambda$loadRestrictedStatusEmojis$245(this.f20427c, this.d);
                return;
            default:
                this.f20426b.lambda$loadReplyIcons$243(this.f20427c, this.d);
                return;
        }
    }
}
