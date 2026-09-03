package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y6 implements RequestDelegate {
    public final int f19007a;
    public final MediaDataController f19008b;
    public final SharedPreferences f19009c;

    public y6(MediaDataController mediaDataController, SharedPreferences sharedPreferences, int i10) {
        this.f19007a = i10;
        this.f19008b = mediaDataController;
        this.f19009c = sharedPreferences;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19007a) {
            case 0:
                this.f19008b.lambda$loadRestrictedStatusEmojis$246(this.f19009c, tLObject, tL_error);
                return;
            case 1:
                this.f19008b.lambda$loadSavedReactions$240(this.f19009c, tLObject, tL_error);
                return;
            default:
                this.f19008b.lambda$loadReplyIcons$244(this.f19009c, tLObject, tL_error);
                return;
        }
    }
}
