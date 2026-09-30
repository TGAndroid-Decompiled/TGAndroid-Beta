package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class j7 implements RequestDelegate {
    public final int f16730a;
    public final MediaDataController f16731b;
    public final SharedPreferences f16732c;

    public j7(MediaDataController mediaDataController, SharedPreferences sharedPreferences, int i10) {
        this.f16730a = i10;
        this.f16731b = mediaDataController;
        this.f16732c = sharedPreferences;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16730a) {
            case 0:
                this.f16731b.lambda$loadSavedReactions$241(this.f16732c, tLObject, tL_error);
                return;
            case 1:
                this.f16731b.lambda$loadReplyIcons$245(this.f16732c, tLObject, tL_error);
                return;
            default:
                this.f16731b.lambda$loadRestrictedStatusEmojis$247(this.f16732c, tLObject, tL_error);
                return;
        }
    }
}
