package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;

public final class f8 implements Runnable {

    public final int f20235a;

    public final MediaDataController f20236b;

    public final TLObject f20237c;
    public final SharedPreferences d;

    public f8(MediaDataController mediaDataController, TLObject tLObject, SharedPreferences sharedPreferences, int i10) {
        this.f20235a = i10;
        this.f20236b = mediaDataController;
        this.f20237c = tLObject;
        this.d = sharedPreferences;
    }

    @Override
    public final void run() {
        switch (this.f20235a) {
            case 0:
                this.f20236b.lambda$loadRestrictedStatusEmojis$245(this.f20237c, this.d);
                break;
            default:
                this.f20236b.lambda$loadReplyIcons$243(this.f20237c, this.d);
                break;
        }
    }
}
