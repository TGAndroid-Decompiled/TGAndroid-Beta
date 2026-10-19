package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;
public final class v7 implements Runnable {
    public final int f19716a;
    public final MediaDataController f19717b;
    public final TLObject f19718c;
    public final SharedPreferences d;

    public v7(MediaDataController mediaDataController, TLObject tLObject, SharedPreferences sharedPreferences, int i10) {
        this.f19716a = i10;
        this.f19717b = mediaDataController;
        this.f19718c = tLObject;
        this.d = sharedPreferences;
    }

    @Override
    public final void run() {
        switch (this.f19716a) {
            case 0:
                this.f19717b.lambda$loadRestrictedStatusEmojis$246(this.f19718c, this.d);
                return;
            default:
                this.f19717b.lambda$loadReplyIcons$244(this.f19718c, this.d);
                return;
        }
    }
}
