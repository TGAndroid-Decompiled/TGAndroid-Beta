package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;
public final class e8 implements Runnable {
    public final int f17573a;
    public final MediaDataController f17574b;
    public final TLObject f17575c;
    public final SharedPreferences d;

    public e8(MediaDataController mediaDataController, TLObject tLObject, SharedPreferences sharedPreferences, int i10) {
        this.f17573a = i10;
        this.f17574b = mediaDataController;
        this.f17575c = tLObject;
        this.d = sharedPreferences;
    }

    @Override
    public final void run() {
        switch (this.f17573a) {
            case 0:
                this.f17574b.lambda$loadRestrictedStatusEmojis$245(this.f17575c, this.d);
                return;
            default:
                this.f17574b.lambda$loadReplyIcons$243(this.f17575c, this.d);
                return;
        }
    }
}
