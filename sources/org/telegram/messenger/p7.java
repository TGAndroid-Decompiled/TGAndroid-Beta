package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class p7 implements RequestDelegate {
    public final int f19197a;
    public final MediaDataController f19198b;
    public final SharedPreferences f19199c;

    public p7(MediaDataController mediaDataController, SharedPreferences sharedPreferences, int i10) {
        this.f19197a = i10;
        this.f19198b = mediaDataController;
        this.f19199c = sharedPreferences;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19197a) {
            case 0:
                this.f19198b.lambda$loadSavedReactions$241(this.f19199c, tLObject, tL_error);
                return;
            case 1:
                this.f19198b.lambda$loadReplyIcons$245(this.f19199c, tLObject, tL_error);
                return;
            default:
                this.f19198b.lambda$loadRestrictedStatusEmojis$247(this.f19199c, tLObject, tL_error);
                return;
        }
    }
}
