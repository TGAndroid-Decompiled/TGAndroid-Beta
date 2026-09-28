package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class j7 implements RequestDelegate {
    public final int f16713a;
    public final MediaDataController f16714b;
    public final SharedPreferences f16715c;

    public j7(MediaDataController mediaDataController, SharedPreferences sharedPreferences, int i10) {
        this.f16713a = i10;
        this.f16714b = mediaDataController;
        this.f16715c = sharedPreferences;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16713a) {
            case 0:
                this.f16714b.lambda$loadSavedReactions$241(this.f16715c, tLObject, tL_error);
                return;
            case 1:
                this.f16714b.lambda$loadReplyIcons$245(this.f16715c, tLObject, tL_error);
                return;
            default:
                this.f16714b.lambda$loadRestrictedStatusEmojis$247(this.f16715c, tLObject, tL_error);
                return;
        }
    }
}
