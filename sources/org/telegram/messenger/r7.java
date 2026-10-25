package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class r7 implements RequestDelegate {
    public final int f21109a;
    public final MediaDataController f21110b;
    public final SharedPreferences f21111c;

    public r7(MediaDataController mediaDataController, SharedPreferences sharedPreferences, int i10) {
        this.f21109a = i10;
        this.f21110b = mediaDataController;
        this.f21111c = sharedPreferences;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21109a) {
            case 0:
                this.f21110b.lambda$loadSavedReactions$241(this.f21111c, tLObject, tL_error);
                return;
            case 1:
                this.f21110b.lambda$loadReplyIcons$245(this.f21111c, tLObject, tL_error);
                return;
            default:
                this.f21110b.lambda$loadRestrictedStatusEmojis$247(this.f21111c, tLObject, tL_error);
                return;
        }
    }
}
