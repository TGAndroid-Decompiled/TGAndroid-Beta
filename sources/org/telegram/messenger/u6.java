package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class u6 implements RequestDelegate {
    public final int f19147a;
    public final MediaDataController f19148b;
    public final SharedPreferences f19149c;

    public u6(MediaDataController mediaDataController, SharedPreferences sharedPreferences, int i10) {
        this.f19147a = i10;
        this.f19148b = mediaDataController;
        this.f19149c = sharedPreferences;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19147a) {
            case 0:
                this.f19148b.lambda$loadRestrictedStatusEmojis$246(this.f19149c, tLObject, tL_error);
                return;
            case 1:
                this.f19148b.lambda$loadSavedReactions$240(this.f19149c, tLObject, tL_error);
                return;
            default:
                this.f19148b.lambda$loadReplyIcons$244(this.f19149c, tLObject, tL_error);
                return;
        }
    }
}
