package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class m7 implements RequestDelegate {
    public final int f18927a;
    public final MediaDataController f18928b;
    public final SharedPreferences f18929c;

    public m7(MediaDataController mediaDataController, SharedPreferences sharedPreferences, int i10) {
        this.f18927a = i10;
        this.f18928b = mediaDataController;
        this.f18929c = sharedPreferences;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18927a) {
            case 0:
                this.f18928b.lambda$loadSavedReactions$241(this.f18929c, tLObject, tL_error);
                return;
            case 1:
                this.f18928b.lambda$loadReplyIcons$245(this.f18929c, tLObject, tL_error);
                return;
            default:
                this.f18928b.lambda$loadRestrictedStatusEmojis$247(this.f18929c, tLObject, tL_error);
                return;
        }
    }
}
