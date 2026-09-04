package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class u6 implements RequestDelegate {
    public final int f19120a;
    public final MediaDataController f19121b;
    public final SharedPreferences f19122c;

    public u6(MediaDataController mediaDataController, SharedPreferences sharedPreferences, int i10) {
        this.f19120a = i10;
        this.f19121b = mediaDataController;
        this.f19122c = sharedPreferences;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19120a) {
            case 0:
                this.f19121b.lambda$loadRestrictedStatusEmojis$246(this.f19122c, tLObject, tL_error);
                return;
            case 1:
                this.f19121b.lambda$loadSavedReactions$240(this.f19122c, tLObject, tL_error);
                return;
            default:
                this.f19121b.lambda$loadReplyIcons$244(this.f19122c, tLObject, tL_error);
                return;
        }
    }
}
