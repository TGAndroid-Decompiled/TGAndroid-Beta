package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;
public final class e8 implements Runnable {
    public final int f17546a;
    public final MediaDataController f17547b;
    public final TLObject f17548c;
    public final SharedPreferences d;

    public e8(MediaDataController mediaDataController, TLObject tLObject, SharedPreferences sharedPreferences, int i10) {
        this.f17546a = i10;
        this.f17547b = mediaDataController;
        this.f17548c = tLObject;
        this.d = sharedPreferences;
    }

    @Override
    public final void run() {
        switch (this.f17546a) {
            case 0:
                this.f17547b.lambda$loadRestrictedStatusEmojis$245(this.f17548c, this.d);
                return;
            default:
                this.f17547b.lambda$loadReplyIcons$243(this.f17548c, this.d);
                return;
        }
    }
}
