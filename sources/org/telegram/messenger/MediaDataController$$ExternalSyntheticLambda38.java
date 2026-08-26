package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class MediaDataController$$ExternalSyntheticLambda38 implements RequestDelegate {
    public final int $r8$classId;
    public final MediaDataController f$0;
    public final SharedPreferences f$1;

    public MediaDataController$$ExternalSyntheticLambda38(MediaDataController mediaDataController, SharedPreferences sharedPreferences, int i) {
        this.$r8$classId = i;
        this.f$0 = mediaDataController;
        this.f$1 = sharedPreferences;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$loadReplyIcons$244(this.f$1, tLObject, tL_error);
                break;
            case 1:
                this.f$0.lambda$loadRestrictedStatusEmojis$246(this.f$1, tLObject, tL_error);
                break;
            default:
                this.f$0.lambda$loadSavedReactions$240(this.f$1, tLObject, tL_error);
                break;
        }
    }
}
