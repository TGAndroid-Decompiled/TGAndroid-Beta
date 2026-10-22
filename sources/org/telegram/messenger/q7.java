package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class q7 implements RequestDelegate {
    public final int f19270a;
    public final MediaDataController f19271b;
    public final SharedPreferences f19272c;

    public q7(MediaDataController mediaDataController, SharedPreferences sharedPreferences, int i10) {
        this.f19270a = i10;
        this.f19271b = mediaDataController;
        this.f19272c = sharedPreferences;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19270a) {
            case 0:
                this.f19271b.lambda$loadSavedReactions$241(this.f19272c, tLObject, tL_error);
                return;
            case 1:
                this.f19271b.lambda$loadReplyIcons$245(this.f19272c, tLObject, tL_error);
                return;
            default:
                this.f19271b.lambda$loadRestrictedStatusEmojis$247(this.f19272c, tLObject, tL_error);
                return;
        }
    }
}
