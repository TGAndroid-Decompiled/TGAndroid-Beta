package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;
public final class i8 implements Runnable {
    public final int f17465a;
    public final MediaDataController f17466b;
    public final TLObject f17467c;
    public final SharedPreferences d;

    public i8(MediaDataController mediaDataController, TLObject tLObject, SharedPreferences sharedPreferences, int i10) {
        this.f17465a = i10;
        this.f17466b = mediaDataController;
        this.f17467c = tLObject;
        this.d = sharedPreferences;
    }

    @Override
    public final void run() {
        switch (this.f17465a) {
            case 0:
                this.f17466b.lambda$loadRestrictedStatusEmojis$245(this.f17467c, this.d);
                return;
            default:
                this.f17466b.lambda$loadReplyIcons$243(this.f17467c, this.d);
                return;
        }
    }
}
