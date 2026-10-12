package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;
public final class w7 implements Runnable {
    public final int f19445a;
    public final MediaDataController f19446b;
    public final TLObject f19447c;
    public final SharedPreferences d;

    public w7(MediaDataController mediaDataController, TLObject tLObject, SharedPreferences sharedPreferences, int i10) {
        this.f19445a = i10;
        this.f19446b = mediaDataController;
        this.f19447c = tLObject;
        this.d = sharedPreferences;
    }

    @Override
    public final void run() {
        switch (this.f19445a) {
            case 0:
                this.f19446b.lambda$loadRestrictedStatusEmojis$246(this.f19447c, this.d);
                return;
            default:
                this.f19446b.lambda$loadReplyIcons$244(this.f19447c, this.d);
                return;
        }
    }
}
