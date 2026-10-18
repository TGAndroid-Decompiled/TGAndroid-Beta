package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class g9 implements Runnable {
    public final int f18433a;
    public final MediaDataController f18434b;
    public final TLRPC.TL_error f18435c;
    public final TLObject d;
    public final SharedPreferences e;
    public final boolean[] f18436f;

    public g9(MediaDataController mediaDataController, TLRPC.TL_error tL_error, TLObject tLObject, SharedPreferences sharedPreferences, boolean[] zArr, int i10) {
        this.f18433a = i10;
        this.f18434b = mediaDataController;
        this.f18435c = tL_error;
        this.d = tLObject;
        this.e = sharedPreferences;
        this.f18436f = zArr;
    }

    @Override
    public final void run() {
        switch (this.f18433a) {
            case 0:
                SharedPreferences sharedPreferences = this.e;
                boolean[] zArr = this.f18436f;
                this.f18434b.lambda$loadRecentAndTopReactions$238(this.f18435c, this.d, sharedPreferences, zArr);
                return;
            default:
                SharedPreferences sharedPreferences2 = this.e;
                boolean[] zArr2 = this.f18436f;
                this.f18434b.lambda$loadRecentAndTopReactions$236(this.f18435c, this.d, sharedPreferences2, zArr2);
                return;
        }
    }
}
