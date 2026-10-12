package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class n7 implements RequestDelegate {
    public final int f18358a;
    public final MediaDataController f18359b;
    public final SharedPreferences f18360c;

    public n7(MediaDataController mediaDataController, SharedPreferences sharedPreferences, int i10) {
        this.f18358a = i10;
        this.f18359b = mediaDataController;
        this.f18360c = sharedPreferences;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18358a) {
            case 0:
                this.f18359b.lambda$loadSavedReactions$241(this.f18360c, tLObject, tL_error);
                return;
            case 1:
                this.f18359b.lambda$loadReplyIcons$245(this.f18360c, tLObject, tL_error);
                return;
            default:
                this.f18359b.lambda$loadRestrictedStatusEmojis$247(this.f18360c, tLObject, tL_error);
                return;
        }
    }
}
