package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class k7 implements RequestDelegate {
    public final int f18327a;
    public final MediaDataController f18328b;
    public final SharedPreferences f18329c;

    public k7(MediaDataController mediaDataController, SharedPreferences sharedPreferences, int i10) {
        this.f18327a = i10;
        this.f18328b = mediaDataController;
        this.f18329c = sharedPreferences;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18327a) {
            case 0:
                this.f18328b.lambda$loadSavedReactions$241(this.f18329c, tLObject, tL_error);
                return;
            case 1:
                this.f18328b.lambda$loadReplyIcons$245(this.f18329c, tLObject, tL_error);
                return;
            default:
                this.f18328b.lambda$loadRestrictedStatusEmojis$247(this.f18329c, tLObject, tL_error);
                return;
        }
    }
}
