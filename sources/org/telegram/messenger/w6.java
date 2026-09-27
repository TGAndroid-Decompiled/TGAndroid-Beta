package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class w6 implements Runnable {
    public final int f17988a;
    public final MediaDataController f17989b;
    public final TLRPC.TL_error f17990c;
    public final TLObject d;
    public final SharedPreferences e;
    public final boolean[] f17991f;

    public w6(MediaDataController mediaDataController, TLRPC.TL_error tL_error, TLObject tLObject, SharedPreferences sharedPreferences, boolean[] zArr, int i10) {
        this.f17988a = i10;
        this.f17989b = mediaDataController;
        this.f17990c = tL_error;
        this.d = tLObject;
        this.e = sharedPreferences;
        this.f17991f = zArr;
    }

    @Override
    public final void run() {
        switch (this.f17988a) {
            case 0:
                SharedPreferences sharedPreferences = this.e;
                boolean[] zArr = this.f17991f;
                this.f17989b.lambda$loadRecentAndTopReactions$237(this.f17990c, this.d, sharedPreferences, zArr);
                return;
            default:
                SharedPreferences sharedPreferences2 = this.e;
                boolean[] zArr2 = this.f17991f;
                this.f17989b.lambda$loadRecentAndTopReactions$235(this.f17990c, this.d, sharedPreferences2, zArr2);
                return;
        }
    }
}
