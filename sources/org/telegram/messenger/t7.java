package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;
public final class t7 implements Runnable {
    public final int f19259a;
    public final MediaDataController f19260b;
    public final TLObject f19261c;
    public final SharedPreferences d;

    public t7(MediaDataController mediaDataController, TLObject tLObject, SharedPreferences sharedPreferences, int i10) {
        this.f19259a = i10;
        this.f19260b = mediaDataController;
        this.f19261c = tLObject;
        this.d = sharedPreferences;
    }

    @Override
    public final void run() {
        switch (this.f19259a) {
            case 0:
                this.f19260b.lambda$loadRestrictedStatusEmojis$246(this.f19261c, this.d);
                return;
            default:
                this.f19260b.lambda$loadReplyIcons$244(this.f19261c, this.d);
                return;
        }
    }
}
