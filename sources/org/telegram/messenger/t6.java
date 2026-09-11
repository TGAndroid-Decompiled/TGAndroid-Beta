package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t6 implements RequestDelegate {
    public final int f19048a;
    public final MediaDataController f19049b;
    public final SharedPreferences f19050c;

    public t6(MediaDataController mediaDataController, SharedPreferences sharedPreferences, int i10) {
        this.f19048a = i10;
        this.f19049b = mediaDataController;
        this.f19050c = sharedPreferences;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19048a) {
            case 0:
                this.f19049b.lambda$loadRestrictedStatusEmojis$246(this.f19050c, tLObject, tL_error);
                return;
            case 1:
                this.f19049b.lambda$loadSavedReactions$240(this.f19050c, tLObject, tL_error);
                return;
            default:
                this.f19049b.lambda$loadReplyIcons$244(this.f19050c, tLObject, tL_error);
                return;
        }
    }
}
