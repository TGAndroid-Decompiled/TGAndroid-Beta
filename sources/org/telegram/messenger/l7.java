package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class l7 implements RequestDelegate {
    public final int f18849a;
    public final MediaDataController f18850b;
    public final SharedPreferences f18851c;

    public l7(MediaDataController mediaDataController, SharedPreferences sharedPreferences, int i10) {
        this.f18849a = i10;
        this.f18850b = mediaDataController;
        this.f18851c = sharedPreferences;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18849a) {
            case 0:
                this.f18850b.lambda$loadSavedReactions$241(this.f18851c, tLObject, tL_error);
                return;
            case 1:
                this.f18850b.lambda$loadReplyIcons$245(this.f18851c, tLObject, tL_error);
                return;
            default:
                this.f18850b.lambda$loadRestrictedStatusEmojis$247(this.f18851c, tLObject, tL_error);
                return;
        }
    }
}
