package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a7 implements Runnable {
    public final int f16706a;
    public final MediaDataController f16707b;
    public final TLRPC.TL_error f16708c;
    public final TLObject d;
    public final SharedPreferences e;
    public final boolean[] f16709f;

    public a7(MediaDataController mediaDataController, TLRPC.TL_error tL_error, TLObject tLObject, SharedPreferences sharedPreferences, boolean[] zArr, int i10) {
        this.f16706a = i10;
        this.f16707b = mediaDataController;
        this.f16708c = tL_error;
        this.d = tLObject;
        this.e = sharedPreferences;
        this.f16709f = zArr;
    }

    @Override
    public final void run() {
        switch (this.f16706a) {
            case 0:
                SharedPreferences sharedPreferences = this.e;
                boolean[] zArr = this.f16709f;
                this.f16707b.lambda$loadRecentAndTopReactions$237(this.f16708c, this.d, sharedPreferences, zArr);
                return;
            default:
                SharedPreferences sharedPreferences2 = this.e;
                boolean[] zArr2 = this.f16709f;
                this.f16707b.lambda$loadRecentAndTopReactions$235(this.f16708c, this.d, sharedPreferences2, zArr2);
                return;
        }
    }
}
