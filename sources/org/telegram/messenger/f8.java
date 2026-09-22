package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;
public final class f8 implements Runnable {
    public final int f16341a;
    public final MediaDataController f16342b;
    public final TLObject f16343c;
    public final SharedPreferences d;

    public f8(MediaDataController mediaDataController, TLObject tLObject, SharedPreferences sharedPreferences, int i10) {
        this.f16341a = i10;
        this.f16342b = mediaDataController;
        this.f16343c = tLObject;
        this.d = sharedPreferences;
    }

    @Override
    public final void run() {
        switch (this.f16341a) {
            case 0:
                this.f16342b.lambda$loadRestrictedStatusEmojis$245(this.f16343c, this.d);
                return;
            default:
                this.f16342b.lambda$loadReplyIcons$243(this.f16343c, this.d);
                return;
        }
    }
}
