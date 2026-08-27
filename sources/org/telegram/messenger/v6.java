package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class v6 implements RequestDelegate {

    public final int f21773a;

    public final MediaDataController f21774b;

    public final SharedPreferences f21775c;

    public v6(MediaDataController mediaDataController, SharedPreferences sharedPreferences, int i10) {
        this.f21773a = i10;
        this.f21774b = mediaDataController;
        this.f21775c = sharedPreferences;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21773a) {
            case 0:
                this.f21774b.lambda$loadRestrictedStatusEmojis$246(this.f21775c, tLObject, tL_error);
                break;
            case 1:
                this.f21774b.lambda$loadSavedReactions$240(this.f21775c, tLObject, tL_error);
                break;
            default:
                this.f21774b.lambda$loadReplyIcons$244(this.f21775c, tLObject, tL_error);
                break;
        }
    }
}
