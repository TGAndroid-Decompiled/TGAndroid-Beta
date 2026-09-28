package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f9 implements Runnable {
    public final int f16362a;
    public final MediaDataController f16363b;
    public final TLRPC.TL_error f16364c;
    public final TLObject d;
    public final SharedPreferences e;
    public final boolean[] f16365f;

    public f9(MediaDataController mediaDataController, TLRPC.TL_error tL_error, TLObject tLObject, SharedPreferences sharedPreferences, boolean[] zArr, int i10) {
        this.f16362a = i10;
        this.f16363b = mediaDataController;
        this.f16364c = tL_error;
        this.d = tLObject;
        this.e = sharedPreferences;
        this.f16365f = zArr;
    }

    @Override
    public final void run() {
        switch (this.f16362a) {
            case 0:
                SharedPreferences sharedPreferences = this.e;
                boolean[] zArr = this.f16365f;
                this.f16363b.lambda$loadRecentAndTopReactions$238(this.f16364c, this.d, sharedPreferences, zArr);
                return;
            default:
                SharedPreferences sharedPreferences2 = this.e;
                boolean[] zArr2 = this.f16365f;
                this.f16363b.lambda$loadRecentAndTopReactions$236(this.f16364c, this.d, sharedPreferences2, zArr2);
                return;
        }
    }
}
