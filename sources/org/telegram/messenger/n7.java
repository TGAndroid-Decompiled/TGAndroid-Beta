package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class n7 implements RequestDelegate {
    public final int f18357a;
    public final MediaDataController f18358b;
    public final SharedPreferences f18359c;

    public n7(MediaDataController mediaDataController, SharedPreferences sharedPreferences, int i10) {
        this.f18357a = i10;
        this.f18358b = mediaDataController;
        this.f18359c = sharedPreferences;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18357a) {
            case 0:
                this.f18358b.lambda$loadSavedReactions$241(this.f18359c, tLObject, tL_error);
                return;
            case 1:
                this.f18358b.lambda$loadReplyIcons$245(this.f18359c, tLObject, tL_error);
                return;
            default:
                this.f18358b.lambda$loadRestrictedStatusEmojis$247(this.f18359c, tLObject, tL_error);
                return;
        }
    }
}
