package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class l7 implements RequestDelegate {
    public final int f18846a;
    public final MediaDataController f18847b;
    public final SharedPreferences f18848c;

    public l7(MediaDataController mediaDataController, SharedPreferences sharedPreferences, int i10) {
        this.f18846a = i10;
        this.f18847b = mediaDataController;
        this.f18848c = sharedPreferences;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18846a) {
            case 0:
                this.f18847b.lambda$loadSavedReactions$241(this.f18848c, tLObject, tL_error);
                return;
            case 1:
                this.f18847b.lambda$loadReplyIcons$245(this.f18848c, tLObject, tL_error);
                return;
            default:
                this.f18847b.lambda$loadRestrictedStatusEmojis$247(this.f18848c, tLObject, tL_error);
                return;
        }
    }
}
