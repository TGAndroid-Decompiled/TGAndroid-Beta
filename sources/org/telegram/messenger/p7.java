package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class p7 implements RequestDelegate {
    public final int f19262a;
    public final MediaDataController f19263b;
    public final SharedPreferences f19264c;

    public p7(MediaDataController mediaDataController, SharedPreferences sharedPreferences, int i10) {
        this.f19262a = i10;
        this.f19263b = mediaDataController;
        this.f19264c = sharedPreferences;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19262a) {
            case 0:
                this.f19263b.lambda$loadSavedReactions$241(this.f19264c, tLObject, tL_error);
                return;
            case 1:
                this.f19263b.lambda$loadReplyIcons$245(this.f19264c, tLObject, tL_error);
                return;
            default:
                this.f19263b.lambda$loadRestrictedStatusEmojis$247(this.f19264c, tLObject, tL_error);
                return;
        }
    }
}
