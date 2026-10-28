package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class s7 implements RequestDelegate {
    public final int f21186a;
    public final MediaDataController f21187b;
    public final SharedPreferences f21188c;

    public s7(MediaDataController mediaDataController, SharedPreferences sharedPreferences, int i10) {
        this.f21186a = i10;
        this.f21187b = mediaDataController;
        this.f21188c = sharedPreferences;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21186a) {
            case 0:
                this.f21187b.lambda$loadSavedReactions$241(this.f21188c, tLObject, tL_error);
                return;
            case 1:
                this.f21187b.lambda$loadReplyIcons$245(this.f21188c, tLObject, tL_error);
                return;
            default:
                this.f21187b.lambda$loadRestrictedStatusEmojis$247(this.f21188c, tLObject, tL_error);
                return;
        }
    }
}
