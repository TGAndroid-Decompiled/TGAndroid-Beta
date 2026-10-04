package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class j7 implements RequestDelegate {
    public final int f18235a;
    public final MediaDataController f18236b;
    public final SharedPreferences f18237c;

    public j7(MediaDataController mediaDataController, SharedPreferences sharedPreferences, int i10) {
        this.f18235a = i10;
        this.f18236b = mediaDataController;
        this.f18237c = sharedPreferences;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18235a) {
            case 0:
                this.f18236b.lambda$loadSavedReactions$241(this.f18237c, tLObject, tL_error);
                return;
            case 1:
                this.f18236b.lambda$loadReplyIcons$245(this.f18237c, tLObject, tL_error);
                return;
            default:
                this.f18236b.lambda$loadRestrictedStatusEmojis$247(this.f18237c, tLObject, tL_error);
                return;
        }
    }
}
