package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class MediaDataController$$ExternalSyntheticLambda56 implements Runnable {
    public final int $r8$classId;
    public final MediaDataController f$0;
    public final TLRPC.TL_error f$1;
    public final TLObject f$2;
    public final SharedPreferences f$3;
    public final boolean[] f$4;

    public MediaDataController$$ExternalSyntheticLambda56(MediaDataController mediaDataController, TLRPC.TL_error tL_error, TLObject tLObject, SharedPreferences sharedPreferences, boolean[] zArr, int i) {
        this.$r8$classId = i;
        this.f$0 = mediaDataController;
        this.f$1 = tL_error;
        this.f$2 = tLObject;
        this.f$3 = sharedPreferences;
        this.f$4 = zArr;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$loadRecentAndTopReactions$235(this.f$1, this.f$2, this.f$3, this.f$4);
                break;
            default:
                this.f$0.lambda$loadRecentAndTopReactions$237(this.f$1, this.f$2, this.f$3, this.f$4);
                break;
        }
    }
}
