package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class k7 implements RequestDelegate {
    public final int f18331a;
    public final MediaDataController f18332b;
    public final SharedPreferences f18333c;

    public k7(MediaDataController mediaDataController, SharedPreferences sharedPreferences, int i10) {
        this.f18331a = i10;
        this.f18332b = mediaDataController;
        this.f18333c = sharedPreferences;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18331a) {
            case 0:
                this.f18332b.lambda$loadSavedReactions$241(this.f18333c, tLObject, tL_error);
                return;
            case 1:
                this.f18332b.lambda$loadReplyIcons$245(this.f18333c, tLObject, tL_error);
                return;
            default:
                this.f18332b.lambda$loadRestrictedStatusEmojis$247(this.f18333c, tLObject, tL_error);
                return;
        }
    }
}
