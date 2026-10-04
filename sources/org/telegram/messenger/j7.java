package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class j7 implements RequestDelegate {
    public final int f18229a;
    public final MediaDataController f18230b;
    public final SharedPreferences f18231c;

    public j7(MediaDataController mediaDataController, SharedPreferences sharedPreferences, int i10) {
        this.f18229a = i10;
        this.f18230b = mediaDataController;
        this.f18231c = sharedPreferences;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18229a) {
            case 0:
                this.f18230b.lambda$loadSavedReactions$241(this.f18231c, tLObject, tL_error);
                return;
            case 1:
                this.f18230b.lambda$loadReplyIcons$245(this.f18231c, tLObject, tL_error);
                return;
            default:
                this.f18230b.lambda$loadRestrictedStatusEmojis$247(this.f18231c, tLObject, tL_error);
                return;
        }
    }
}
