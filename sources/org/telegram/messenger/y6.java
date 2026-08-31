package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y6 implements RequestDelegate {
    public final int f20678a;
    public final MediaDataController f20679b;
    public final SharedPreferences f20680c;

    public y6(MediaDataController mediaDataController, SharedPreferences sharedPreferences, int i10) {
        this.f20678a = i10;
        this.f20679b = mediaDataController;
        this.f20680c = sharedPreferences;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20678a) {
            case 0:
                this.f20679b.lambda$loadRestrictedStatusEmojis$246(this.f20680c, tLObject, tL_error);
                return;
            case 1:
                this.f20679b.lambda$loadSavedReactions$240(this.f20680c, tLObject, tL_error);
                return;
            default:
                this.f20679b.lambda$loadReplyIcons$244(this.f20680c, tLObject, tL_error);
                return;
        }
    }
}
