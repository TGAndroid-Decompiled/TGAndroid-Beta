package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class u6 implements RequestDelegate {
    public final int f17433a;
    public final MediaDataController f17434b;
    public final SharedPreferences f17435c;

    public u6(MediaDataController mediaDataController, SharedPreferences sharedPreferences, int i10) {
        this.f17433a = i10;
        this.f17434b = mediaDataController;
        this.f17435c = sharedPreferences;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17433a) {
            case 0:
                this.f17434b.lambda$loadRestrictedStatusEmojis$246(this.f17435c, tLObject, tL_error);
                return;
            case 1:
                this.f17434b.lambda$loadSavedReactions$240(this.f17435c, tLObject, tL_error);
                return;
            default:
                this.f17434b.lambda$loadReplyIcons$244(this.f17435c, tLObject, tL_error);
                return;
        }
    }
}
