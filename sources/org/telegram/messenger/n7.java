package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class n7 implements RequestDelegate {
    public final int f19017a;
    public final MediaDataController f19018b;
    public final SharedPreferences f19019c;

    public n7(MediaDataController mediaDataController, SharedPreferences sharedPreferences, int i10) {
        this.f19017a = i10;
        this.f19018b = mediaDataController;
        this.f19019c = sharedPreferences;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19017a) {
            case 0:
                this.f19018b.lambda$loadSavedReactions$241(this.f19019c, tLObject, tL_error);
                return;
            case 1:
                this.f19018b.lambda$loadReplyIcons$245(this.f19019c, tLObject, tL_error);
                return;
            default:
                this.f19018b.lambda$loadRestrictedStatusEmojis$247(this.f19019c, tLObject, tL_error);
                return;
        }
    }
}
