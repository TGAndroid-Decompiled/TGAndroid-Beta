package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class l7 implements RequestDelegate {
    public final int f18848a;
    public final MediaDataController f18849b;
    public final SharedPreferences f18850c;

    public l7(MediaDataController mediaDataController, SharedPreferences sharedPreferences, int i10) {
        this.f18848a = i10;
        this.f18849b = mediaDataController;
        this.f18850c = sharedPreferences;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18848a) {
            case 0:
                this.f18849b.lambda$loadSavedReactions$241(this.f18850c, tLObject, tL_error);
                return;
            case 1:
                this.f18849b.lambda$loadReplyIcons$245(this.f18850c, tLObject, tL_error);
                return;
            default:
                this.f18849b.lambda$loadRestrictedStatusEmojis$247(this.f18850c, tLObject, tL_error);
                return;
        }
    }
}
