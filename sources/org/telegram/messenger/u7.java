package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;
public final class u7 implements Runnable {
    public final int f19638a;
    public final MediaDataController f19639b;
    public final TLObject f19640c;
    public final SharedPreferences d;

    public u7(MediaDataController mediaDataController, TLObject tLObject, SharedPreferences sharedPreferences, int i10) {
        this.f19638a = i10;
        this.f19639b = mediaDataController;
        this.f19640c = tLObject;
        this.d = sharedPreferences;
    }

    @Override
    public final void run() {
        switch (this.f19638a) {
            case 0:
                this.f19639b.lambda$loadRestrictedStatusEmojis$246(this.f19640c, this.d);
                return;
            default:
                this.f19639b.lambda$loadReplyIcons$244(this.f19640c, this.d);
                return;
        }
    }
}
