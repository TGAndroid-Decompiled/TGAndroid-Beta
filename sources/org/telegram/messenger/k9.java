package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class k9 implements Runnable {
    public final int f18827a;
    public final MediaDataController f18828b;
    public final TLRPC.TL_error f18829c;
    public final TLObject d;
    public final SharedPreferences e;
    public final boolean[] f18830f;

    public k9(MediaDataController mediaDataController, TLRPC.TL_error tL_error, TLObject tLObject, SharedPreferences sharedPreferences, boolean[] zArr, int i10) {
        this.f18827a = i10;
        this.f18828b = mediaDataController;
        this.f18829c = tL_error;
        this.d = tLObject;
        this.e = sharedPreferences;
        this.f18830f = zArr;
    }

    @Override
    public final void run() {
        switch (this.f18827a) {
            case 0:
                SharedPreferences sharedPreferences = this.e;
                boolean[] zArr = this.f18830f;
                this.f18828b.lambda$loadRecentAndTopReactions$238(this.f18829c, this.d, sharedPreferences, zArr);
                return;
            default:
                SharedPreferences sharedPreferences2 = this.e;
                boolean[] zArr2 = this.f18830f;
                this.f18828b.lambda$loadRecentAndTopReactions$236(this.f18829c, this.d, sharedPreferences2, zArr2);
                return;
        }
    }
}
