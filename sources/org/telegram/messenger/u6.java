package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class u6 implements RequestDelegate {
    public final int f17418a;
    public final MediaDataController f17419b;
    public final SharedPreferences f17420c;

    public u6(MediaDataController mediaDataController, SharedPreferences sharedPreferences, int i10) {
        this.f17418a = i10;
        this.f17419b = mediaDataController;
        this.f17420c = sharedPreferences;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17418a) {
            case 0:
                this.f17419b.lambda$loadRestrictedStatusEmojis$246(this.f17420c, tLObject, tL_error);
                return;
            case 1:
                this.f17419b.lambda$loadSavedReactions$240(this.f17420c, tLObject, tL_error);
                return;
            default:
                this.f17419b.lambda$loadReplyIcons$244(this.f17420c, tLObject, tL_error);
                return;
        }
    }
}
