package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class u6 implements RequestDelegate {
    public final int f17655a;
    public final MediaDataController f17656b;
    public final SharedPreferences f17657c;

    public u6(MediaDataController mediaDataController, SharedPreferences sharedPreferences, int i10) {
        this.f17655a = i10;
        this.f17656b = mediaDataController;
        this.f17657c = sharedPreferences;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17655a) {
            case 0:
                this.f17656b.lambda$loadRestrictedStatusEmojis$246(this.f17657c, tLObject, tL_error);
                return;
            case 1:
                this.f17656b.lambda$loadSavedReactions$240(this.f17657c, tLObject, tL_error);
                return;
            default:
                this.f17656b.lambda$loadReplyIcons$244(this.f17657c, tLObject, tL_error);
                return;
        }
    }
}
