package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x6 implements RequestDelegate {
    public final int f22148a;
    public final MediaDataController f22149b;
    public final SharedPreferences f22150c;

    public x6(MediaDataController mediaDataController, SharedPreferences sharedPreferences, int i10) {
        this.f22148a = i10;
        this.f22149b = mediaDataController;
        this.f22150c = sharedPreferences;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f22148a) {
            case 0:
                this.f22149b.lambda$loadRestrictedStatusEmojis$246(this.f22150c, tLObject, tL_error);
                return;
            case 1:
                this.f22149b.lambda$loadSavedReactions$240(this.f22150c, tLObject, tL_error);
                return;
            default:
                this.f22149b.lambda$loadReplyIcons$244(this.f22150c, tLObject, tL_error);
                return;
        }
    }
}
