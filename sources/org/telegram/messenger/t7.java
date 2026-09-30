package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;
public final class t7 implements Runnable {
    public final int f17614a;
    public final MediaDataController f17615b;
    public final TLObject f17616c;
    public final SharedPreferences d;

    public t7(MediaDataController mediaDataController, TLObject tLObject, SharedPreferences sharedPreferences, int i10) {
        this.f17614a = i10;
        this.f17615b = mediaDataController;
        this.f17616c = tLObject;
        this.d = sharedPreferences;
    }

    @Override
    public final void run() {
        switch (this.f17614a) {
            case 0:
                this.f17615b.lambda$loadRestrictedStatusEmojis$246(this.f17616c, this.d);
                return;
            default:
                this.f17615b.lambda$loadReplyIcons$244(this.f17616c, this.d);
                return;
        }
    }
}
