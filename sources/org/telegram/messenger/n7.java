package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class n7 implements RequestDelegate {
    public final int f17628a;
    public final MediaDataController f17629b;
    public final SharedPreferences f17630c;

    public n7(MediaDataController mediaDataController, SharedPreferences sharedPreferences, int i10) {
        this.f17628a = i10;
        this.f17629b = mediaDataController;
        this.f17630c = sharedPreferences;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17628a) {
            case 0:
                this.f17629b.lambda$loadSavedReactions$241(this.f17630c, tLObject, tL_error);
                return;
            case 1:
                this.f17629b.lambda$loadReplyIcons$245(this.f17630c, tLObject, tL_error);
                return;
            default:
                this.f17629b.lambda$loadRestrictedStatusEmojis$247(this.f17630c, tLObject, tL_error);
                return;
        }
    }
}
