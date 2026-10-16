package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;
public final class w7 implements Runnable {
    public final int f18605a;
    public final MediaDataController f18606b;
    public final TLObject f18607c;
    public final SharedPreferences d;

    public w7(MediaDataController mediaDataController, TLObject tLObject, SharedPreferences sharedPreferences, int i10) {
        this.f18605a = i10;
        this.f18606b = mediaDataController;
        this.f18607c = tLObject;
        this.d = sharedPreferences;
    }

    @Override
    public final void run() {
        switch (this.f18605a) {
            case 0:
                this.f18606b.lambda$loadRestrictedStatusEmojis$246(this.f18607c, this.d);
                return;
            default:
                this.f18606b.lambda$loadReplyIcons$244(this.f18607c, this.d);
                return;
        }
    }
}
