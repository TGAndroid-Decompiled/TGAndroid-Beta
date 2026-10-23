package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;
public final class y7 implements Runnable {
    public final int f20203a;
    public final MediaDataController f20204b;
    public final TLObject f20205c;
    public final SharedPreferences d;

    public y7(MediaDataController mediaDataController, TLObject tLObject, SharedPreferences sharedPreferences, int i10) {
        this.f20203a = i10;
        this.f20204b = mediaDataController;
        this.f20205c = tLObject;
        this.d = sharedPreferences;
    }

    @Override
    public final void run() {
        switch (this.f20203a) {
            case 0:
                this.f20204b.lambda$loadRestrictedStatusEmojis$246(this.f20205c, this.d);
                return;
            default:
                this.f20204b.lambda$loadReplyIcons$244(this.f20205c, this.d);
                return;
        }
    }
}
