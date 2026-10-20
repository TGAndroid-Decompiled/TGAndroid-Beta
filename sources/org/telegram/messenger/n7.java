package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class n7 implements RequestDelegate {
    public final int f19021a;
    public final MediaDataController f19022b;
    public final SharedPreferences f19023c;

    public n7(MediaDataController mediaDataController, SharedPreferences sharedPreferences, int i10) {
        this.f19021a = i10;
        this.f19022b = mediaDataController;
        this.f19023c = sharedPreferences;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19021a) {
            case 0:
                this.f19022b.lambda$loadSavedReactions$241(this.f19023c, tLObject, tL_error);
                return;
            case 1:
                this.f19022b.lambda$loadReplyIcons$245(this.f19023c, tLObject, tL_error);
                return;
            default:
                this.f19022b.lambda$loadRestrictedStatusEmojis$247(this.f19023c, tLObject, tL_error);
                return;
        }
    }
}
