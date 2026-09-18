package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class u6 implements RequestDelegate {
    public final int f17618a;
    public final MediaDataController f17619b;
    public final SharedPreferences f17620c;

    public u6(MediaDataController mediaDataController, SharedPreferences sharedPreferences, int i10) {
        this.f17618a = i10;
        this.f17619b = mediaDataController;
        this.f17620c = sharedPreferences;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17618a) {
            case 0:
                this.f17619b.lambda$loadRestrictedStatusEmojis$246(this.f17620c, tLObject, tL_error);
                return;
            case 1:
                this.f17619b.lambda$loadSavedReactions$240(this.f17620c, tLObject, tL_error);
                return;
            default:
                this.f17619b.lambda$loadReplyIcons$244(this.f17620c, tLObject, tL_error);
                return;
        }
    }
}
