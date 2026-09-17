package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t6 implements RequestDelegate {
    public final int f19075a;
    public final MediaDataController f19076b;
    public final SharedPreferences f19077c;

    public t6(MediaDataController mediaDataController, SharedPreferences sharedPreferences, int i10) {
        this.f19075a = i10;
        this.f19076b = mediaDataController;
        this.f19077c = sharedPreferences;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19075a) {
            case 0:
                this.f19076b.lambda$loadRestrictedStatusEmojis$246(this.f19077c, tLObject, tL_error);
                return;
            case 1:
                this.f19076b.lambda$loadSavedReactions$240(this.f19077c, tLObject, tL_error);
                return;
            default:
                this.f19076b.lambda$loadReplyIcons$244(this.f19077c, tLObject, tL_error);
                return;
        }
    }
}
