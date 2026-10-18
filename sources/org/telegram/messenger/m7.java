package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class m7 implements RequestDelegate {
    public final int f18924a;
    public final MediaDataController f18925b;
    public final SharedPreferences f18926c;

    public m7(MediaDataController mediaDataController, SharedPreferences sharedPreferences, int i10) {
        this.f18924a = i10;
        this.f18925b = mediaDataController;
        this.f18926c = sharedPreferences;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18924a) {
            case 0:
                this.f18925b.lambda$loadSavedReactions$241(this.f18926c, tLObject, tL_error);
                return;
            case 1:
                this.f18925b.lambda$loadReplyIcons$245(this.f18926c, tLObject, tL_error);
                return;
            default:
                this.f18925b.lambda$loadRestrictedStatusEmojis$247(this.f18926c, tLObject, tL_error);
                return;
        }
    }
}
