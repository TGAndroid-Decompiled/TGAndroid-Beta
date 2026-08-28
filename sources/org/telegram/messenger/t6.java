package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t6 implements RequestDelegate {
    public final int f21536a;
    public final MediaDataController f21537b;
    public final SharedPreferences f21538c;

    public t6(MediaDataController mediaDataController, SharedPreferences sharedPreferences, int i9) {
        this.f21536a = i9;
        this.f21537b = mediaDataController;
        this.f21538c = sharedPreferences;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21536a) {
            case 0:
                this.f21537b.lambda$loadRestrictedStatusEmojis$246(this.f21538c, tLObject, tL_error);
                return;
            case 1:
                this.f21537b.lambda$loadSavedReactions$240(this.f21538c, tLObject, tL_error);
                return;
            default:
                this.f21537b.lambda$loadReplyIcons$244(this.f21538c, tLObject, tL_error);
                return;
        }
    }
}
