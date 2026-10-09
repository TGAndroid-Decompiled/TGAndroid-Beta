package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;
public final class t7 implements Runnable {
    public final int f19217a;
    public final MediaDataController f19218b;
    public final TLObject f19219c;
    public final SharedPreferences d;

    public t7(MediaDataController mediaDataController, TLObject tLObject, SharedPreferences sharedPreferences, int i10) {
        this.f19217a = i10;
        this.f19218b = mediaDataController;
        this.f19219c = tLObject;
        this.d = sharedPreferences;
    }

    @Override
    public final void run() {
        switch (this.f19217a) {
            case 0:
                this.f19218b.lambda$loadRestrictedStatusEmojis$246(this.f19219c, this.d);
                return;
            default:
                this.f19218b.lambda$loadReplyIcons$244(this.f19219c, this.d);
                return;
        }
    }
}
