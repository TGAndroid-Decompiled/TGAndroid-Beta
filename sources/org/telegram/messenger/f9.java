package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f9 implements Runnable {
    public final int f18357a;
    public final MediaDataController f18358b;
    public final TLRPC.TL_error f18359c;
    public final TLObject d;
    public final SharedPreferences e;
    public final boolean[] f18360f;

    public f9(MediaDataController mediaDataController, TLRPC.TL_error tL_error, TLObject tLObject, SharedPreferences sharedPreferences, boolean[] zArr, int i10) {
        this.f18357a = i10;
        this.f18358b = mediaDataController;
        this.f18359c = tL_error;
        this.d = tLObject;
        this.e = sharedPreferences;
        this.f18360f = zArr;
    }

    @Override
    public final void run() {
        switch (this.f18357a) {
            case 0:
                SharedPreferences sharedPreferences = this.e;
                boolean[] zArr = this.f18360f;
                this.f18358b.lambda$loadRecentAndTopReactions$238(this.f18359c, this.d, sharedPreferences, zArr);
                return;
            default:
                SharedPreferences sharedPreferences2 = this.e;
                boolean[] zArr2 = this.f18360f;
                this.f18358b.lambda$loadRecentAndTopReactions$236(this.f18359c, this.d, sharedPreferences2, zArr2);
                return;
        }
    }
}
