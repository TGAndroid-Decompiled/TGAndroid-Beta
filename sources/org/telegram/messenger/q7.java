package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class q7 implements RequestDelegate {
    public final int f19337a;
    public final MediaDataController f19338b;
    public final SharedPreferences f19339c;

    public q7(MediaDataController mediaDataController, SharedPreferences sharedPreferences, int i10) {
        this.f19337a = i10;
        this.f19338b = mediaDataController;
        this.f19339c = sharedPreferences;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19337a) {
            case 0:
                this.f19338b.lambda$loadSavedReactions$241(this.f19339c, tLObject, tL_error);
                return;
            case 1:
                this.f19338b.lambda$loadReplyIcons$245(this.f19339c, tLObject, tL_error);
                return;
            default:
                this.f19338b.lambda$loadRestrictedStatusEmojis$247(this.f19339c, tLObject, tL_error);
                return;
        }
    }
}
