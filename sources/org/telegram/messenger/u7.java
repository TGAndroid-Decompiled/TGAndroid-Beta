package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;
public final class u7 implements Runnable {
    public final int f19634a;
    public final MediaDataController f19635b;
    public final TLObject f19636c;
    public final SharedPreferences d;

    public u7(MediaDataController mediaDataController, TLObject tLObject, SharedPreferences sharedPreferences, int i10) {
        this.f19634a = i10;
        this.f19635b = mediaDataController;
        this.f19636c = tLObject;
        this.d = sharedPreferences;
    }

    @Override
    public final void run() {
        switch (this.f19634a) {
            case 0:
                this.f19635b.lambda$loadRestrictedStatusEmojis$246(this.f19636c, this.d);
                return;
            default:
                this.f19635b.lambda$loadReplyIcons$244(this.f19636c, this.d);
                return;
        }
    }
}
