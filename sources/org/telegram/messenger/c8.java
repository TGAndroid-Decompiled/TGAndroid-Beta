package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;
public final class c8 implements Runnable {
    public final int f19925a;
    public final MediaDataController f19926b;
    public final TLObject f19927c;
    public final SharedPreferences d;

    public c8(MediaDataController mediaDataController, TLObject tLObject, SharedPreferences sharedPreferences, int i9) {
        this.f19925a = i9;
        this.f19926b = mediaDataController;
        this.f19927c = tLObject;
        this.d = sharedPreferences;
    }

    @Override
    public final void run() {
        switch (this.f19925a) {
            case 0:
                this.f19926b.lambda$loadRestrictedStatusEmojis$245(this.f19927c, this.d);
                return;
            default:
                this.f19926b.lambda$loadReplyIcons$243(this.f19927c, this.d);
                return;
        }
    }
}
