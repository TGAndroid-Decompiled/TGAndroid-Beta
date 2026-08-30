package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y6 implements RequestDelegate {
    public final int f19023a;
    public final MediaDataController f19024b;
    public final SharedPreferences f19025c;

    public y6(MediaDataController mediaDataController, SharedPreferences sharedPreferences, int i10) {
        this.f19023a = i10;
        this.f19024b = mediaDataController;
        this.f19025c = sharedPreferences;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19023a) {
            case 0:
                this.f19024b.lambda$loadRestrictedStatusEmojis$246(this.f19025c, tLObject, tL_error);
                return;
            case 1:
                this.f19024b.lambda$loadSavedReactions$240(this.f19025c, tLObject, tL_error);
                return;
            default:
                this.f19024b.lambda$loadReplyIcons$244(this.f19025c, tLObject, tL_error);
                return;
        }
    }
}
