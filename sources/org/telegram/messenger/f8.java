package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;
public final class f8 implements Runnable {
    public final int f17659a;
    public final MediaDataController f17660b;
    public final TLObject f17661c;
    public final SharedPreferences d;

    public f8(MediaDataController mediaDataController, TLObject tLObject, SharedPreferences sharedPreferences, int i10) {
        this.f17659a = i10;
        this.f17660b = mediaDataController;
        this.f17661c = tLObject;
        this.d = sharedPreferences;
    }

    @Override
    public final void run() {
        switch (this.f17659a) {
            case 0:
                this.f17660b.lambda$loadRestrictedStatusEmojis$245(this.f17661c, this.d);
                return;
            default:
                this.f17660b.lambda$loadReplyIcons$243(this.f17661c, this.d);
                return;
        }
    }
}
