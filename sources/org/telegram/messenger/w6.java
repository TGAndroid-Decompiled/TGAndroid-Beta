package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class w6 implements Runnable {
    public final int f17747a;
    public final MediaDataController f17748b;
    public final TLRPC.TL_error f17749c;
    public final TLObject d;
    public final SharedPreferences e;
    public final boolean[] f17750f;

    public w6(MediaDataController mediaDataController, TLRPC.TL_error tL_error, TLObject tLObject, SharedPreferences sharedPreferences, boolean[] zArr, int i10) {
        this.f17747a = i10;
        this.f17748b = mediaDataController;
        this.f17749c = tL_error;
        this.d = tLObject;
        this.e = sharedPreferences;
        this.f17750f = zArr;
    }

    @Override
    public final void run() {
        switch (this.f17747a) {
            case 0:
                SharedPreferences sharedPreferences = this.e;
                boolean[] zArr = this.f17750f;
                this.f17748b.lambda$loadRecentAndTopReactions$237(this.f17749c, this.d, sharedPreferences, zArr);
                return;
            default:
                SharedPreferences sharedPreferences2 = this.e;
                boolean[] zArr2 = this.f17750f;
                this.f17748b.lambda$loadRecentAndTopReactions$235(this.f17749c, this.d, sharedPreferences2, zArr2);
                return;
        }
    }
}
