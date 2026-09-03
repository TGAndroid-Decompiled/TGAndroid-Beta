package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y6 implements RequestDelegate {
    public final int f20680a;
    public final MediaDataController f20681b;
    public final SharedPreferences f20682c;

    public y6(MediaDataController mediaDataController, SharedPreferences sharedPreferences, int i10) {
        this.f20680a = i10;
        this.f20681b = mediaDataController;
        this.f20682c = sharedPreferences;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20680a) {
            case 0:
                this.f20681b.lambda$loadRestrictedStatusEmojis$246(this.f20682c, tLObject, tL_error);
                return;
            case 1:
                this.f20681b.lambda$loadSavedReactions$240(this.f20682c, tLObject, tL_error);
                return;
            default:
                this.f20681b.lambda$loadReplyIcons$244(this.f20682c, tLObject, tL_error);
                return;
        }
    }
}
