package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;
public final class t7 implements Runnable {
    public final int f19221a;
    public final MediaDataController f19222b;
    public final TLObject f19223c;
    public final SharedPreferences d;

    public t7(MediaDataController mediaDataController, TLObject tLObject, SharedPreferences sharedPreferences, int i10) {
        this.f19221a = i10;
        this.f19222b = mediaDataController;
        this.f19223c = tLObject;
        this.d = sharedPreferences;
    }

    @Override
    public final void run() {
        switch (this.f19221a) {
            case 0:
                this.f19222b.lambda$loadRestrictedStatusEmojis$246(this.f19223c, this.d);
                return;
            default:
                this.f19222b.lambda$loadReplyIcons$244(this.f19223c, this.d);
                return;
        }
    }
}
