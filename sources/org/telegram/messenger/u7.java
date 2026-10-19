package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;
public final class u7 implements Runnable {
    public final int f19635a;
    public final MediaDataController f19636b;
    public final TLObject f19637c;
    public final SharedPreferences d;

    public u7(MediaDataController mediaDataController, TLObject tLObject, SharedPreferences sharedPreferences, int i10) {
        this.f19635a = i10;
        this.f19636b = mediaDataController;
        this.f19637c = tLObject;
        this.d = sharedPreferences;
    }

    @Override
    public final void run() {
        switch (this.f19635a) {
            case 0:
                this.f19636b.lambda$loadRestrictedStatusEmojis$246(this.f19637c, this.d);
                return;
            default:
                this.f19636b.lambda$loadReplyIcons$244(this.f19637c, this.d);
                return;
        }
    }
}
