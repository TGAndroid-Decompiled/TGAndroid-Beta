package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;
public final class b8 implements Runnable {
    public final int f19682a;
    public final MediaDataController f19683b;
    public final TLObject f19684c;
    public final SharedPreferences d;

    public b8(MediaDataController mediaDataController, TLObject tLObject, SharedPreferences sharedPreferences, int i10) {
        this.f19682a = i10;
        this.f19683b = mediaDataController;
        this.f19684c = tLObject;
        this.d = sharedPreferences;
    }

    @Override
    public final void run() {
        switch (this.f19682a) {
            case 0:
                this.f19683b.lambda$loadRestrictedStatusEmojis$246(this.f19684c, this.d);
                return;
            default:
                this.f19683b.lambda$loadReplyIcons$244(this.f19684c, this.d);
                return;
        }
    }
}
