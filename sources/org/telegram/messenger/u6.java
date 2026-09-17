package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class u6 implements RequestDelegate {
    public final int f17444a;
    public final MediaDataController f17445b;
    public final SharedPreferences f17446c;

    public u6(MediaDataController mediaDataController, SharedPreferences sharedPreferences, int i10) {
        this.f17444a = i10;
        this.f17445b = mediaDataController;
        this.f17446c = sharedPreferences;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17444a) {
            case 0:
                this.f17445b.lambda$loadRestrictedStatusEmojis$246(this.f17446c, tLObject, tL_error);
                return;
            case 1:
                this.f17445b.lambda$loadSavedReactions$240(this.f17446c, tLObject, tL_error);
                return;
            default:
                this.f17445b.lambda$loadReplyIcons$244(this.f17446c, tLObject, tL_error);
                return;
        }
    }
}
