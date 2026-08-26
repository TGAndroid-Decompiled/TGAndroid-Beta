package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;

public final class MediaDataController$$ExternalSyntheticLambda42 implements Runnable {
    public final int $r8$classId;
    public final MediaDataController f$0;
    public final TLObject f$1;
    public final SharedPreferences f$2;

    public MediaDataController$$ExternalSyntheticLambda42(MediaDataController mediaDataController, TLObject tLObject, SharedPreferences sharedPreferences, int i) {
        this.$r8$classId = i;
        this.f$0 = mediaDataController;
        this.f$1 = tLObject;
        this.f$2 = sharedPreferences;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$loadReplyIcons$243(this.f$1, this.f$2);
                break;
            default:
                this.f$0.lambda$loadRestrictedStatusEmojis$245(this.f$1, this.f$2);
                break;
        }
    }
}
