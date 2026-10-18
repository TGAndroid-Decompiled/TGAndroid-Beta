package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;
public final class v7 implements Runnable {
    public final int f19713a;
    public final MediaDataController f19714b;
    public final TLObject f19715c;
    public final SharedPreferences d;

    public v7(MediaDataController mediaDataController, TLObject tLObject, SharedPreferences sharedPreferences, int i10) {
        this.f19713a = i10;
        this.f19714b = mediaDataController;
        this.f19715c = tLObject;
        this.d = sharedPreferences;
    }

    @Override
    public final void run() {
        switch (this.f19713a) {
            case 0:
                this.f19714b.lambda$loadRestrictedStatusEmojis$246(this.f19715c, this.d);
                return;
            default:
                this.f19714b.lambda$loadReplyIcons$244(this.f19715c, this.d);
                return;
        }
    }
}
