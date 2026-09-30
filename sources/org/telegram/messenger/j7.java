package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class j7 implements RequestDelegate {
    public final int f16714a;
    public final MediaDataController f16715b;
    public final SharedPreferences f16716c;

    public j7(MediaDataController mediaDataController, SharedPreferences sharedPreferences, int i10) {
        this.f16714a = i10;
        this.f16715b = mediaDataController;
        this.f16716c = sharedPreferences;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16714a) {
            case 0:
                this.f16715b.lambda$loadSavedReactions$241(this.f16716c, tLObject, tL_error);
                return;
            case 1:
                this.f16715b.lambda$loadReplyIcons$245(this.f16716c, tLObject, tL_error);
                return;
            default:
                this.f16715b.lambda$loadRestrictedStatusEmojis$247(this.f16716c, tLObject, tL_error);
                return;
        }
    }
}
