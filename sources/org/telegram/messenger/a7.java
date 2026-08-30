package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a7 implements Runnable {
    public final int f16725a;
    public final MediaDataController f16726b;
    public final TLRPC.TL_error f16727c;
    public final TLObject d;
    public final SharedPreferences e;
    public final boolean[] f16728f;

    public a7(MediaDataController mediaDataController, TLRPC.TL_error tL_error, TLObject tLObject, SharedPreferences sharedPreferences, boolean[] zArr, int i10) {
        this.f16725a = i10;
        this.f16726b = mediaDataController;
        this.f16727c = tL_error;
        this.d = tLObject;
        this.e = sharedPreferences;
        this.f16728f = zArr;
    }

    @Override
    public final void run() {
        switch (this.f16725a) {
            case 0:
                SharedPreferences sharedPreferences = this.e;
                boolean[] zArr = this.f16728f;
                this.f16726b.lambda$loadRecentAndTopReactions$237(this.f16727c, this.d, sharedPreferences, zArr);
                return;
            default:
                SharedPreferences sharedPreferences2 = this.e;
                boolean[] zArr2 = this.f16728f;
                this.f16726b.lambda$loadRecentAndTopReactions$235(this.f16727c, this.d, sharedPreferences2, zArr2);
                return;
        }
    }
}
