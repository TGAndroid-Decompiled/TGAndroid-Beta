package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;
public final class w7 implements Runnable {
    public final int f19958a;
    public final MediaDataController f19959b;
    public final TLObject f19960c;
    public final SharedPreferences d;

    public w7(MediaDataController mediaDataController, TLObject tLObject, SharedPreferences sharedPreferences, int i10) {
        this.f19958a = i10;
        this.f19959b = mediaDataController;
        this.f19960c = tLObject;
        this.d = sharedPreferences;
    }

    @Override
    public final void run() {
        switch (this.f19958a) {
            case 0:
                this.f19959b.lambda$loadRestrictedStatusEmojis$246(this.f19960c, this.d);
                return;
            default:
                this.f19959b.lambda$loadReplyIcons$244(this.f19960c, this.d);
                return;
        }
    }
}
