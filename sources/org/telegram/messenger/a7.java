package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a7 implements RequestDelegate {
    public final int f14689a;
    public final MediaDataController f14690b;
    public final SharedPreferences f14691c;

    public a7(MediaDataController mediaDataController, SharedPreferences sharedPreferences, int i10) {
        this.f14689a = i10;
        this.f14690b = mediaDataController;
        this.f14691c = sharedPreferences;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f14689a) {
            case 0:
                this.f14690b.lambda$loadRestrictedStatusEmojis$246(this.f14691c, tLObject, tL_error);
                return;
            case 1:
                this.f14690b.lambda$loadSavedReactions$240(this.f14691c, tLObject, tL_error);
                return;
            default:
                this.f14690b.lambda$loadReplyIcons$244(this.f14691c, tLObject, tL_error);
                return;
        }
    }
}
