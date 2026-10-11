package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class k7 implements RequestDelegate {
    public final int f18365a;
    public final MediaDataController f18366b;
    public final SharedPreferences f18367c;

    public k7(MediaDataController mediaDataController, SharedPreferences sharedPreferences, int i10) {
        this.f18365a = i10;
        this.f18366b = mediaDataController;
        this.f18367c = sharedPreferences;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18365a) {
            case 0:
                this.f18366b.lambda$loadSavedReactions$241(this.f18367c, tLObject, tL_error);
                return;
            case 1:
                this.f18366b.lambda$loadReplyIcons$245(this.f18367c, tLObject, tL_error);
                return;
            default:
                this.f18366b.lambda$loadRestrictedStatusEmojis$247(this.f18367c, tLObject, tL_error);
                return;
        }
    }
}
