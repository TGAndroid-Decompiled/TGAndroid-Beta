package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;
public final class i8 implements Runnable {
    public final int f18941a;
    public final MediaDataController f18942b;
    public final TLObject f18943c;
    public final SharedPreferences d;

    public i8(MediaDataController mediaDataController, TLObject tLObject, SharedPreferences sharedPreferences, int i10) {
        this.f18941a = i10;
        this.f18942b = mediaDataController;
        this.f18943c = tLObject;
        this.d = sharedPreferences;
    }

    @Override
    public final void run() {
        switch (this.f18941a) {
            case 0:
                this.f18942b.lambda$loadRestrictedStatusEmojis$245(this.f18943c, this.d);
                return;
            default:
                this.f18942b.lambda$loadReplyIcons$243(this.f18943c, this.d);
                return;
        }
    }
}
