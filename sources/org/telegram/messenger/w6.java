package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class w6 implements Runnable {
    public final int f17990a;
    public final MediaDataController f17991b;
    public final TLRPC.TL_error f17992c;
    public final TLObject d;
    public final SharedPreferences e;
    public final boolean[] f17993f;

    public w6(MediaDataController mediaDataController, TLRPC.TL_error tL_error, TLObject tLObject, SharedPreferences sharedPreferences, boolean[] zArr, int i10) {
        this.f17990a = i10;
        this.f17991b = mediaDataController;
        this.f17992c = tL_error;
        this.d = tLObject;
        this.e = sharedPreferences;
        this.f17993f = zArr;
    }

    @Override
    public final void run() {
        switch (this.f17990a) {
            case 0:
                SharedPreferences sharedPreferences = this.e;
                boolean[] zArr = this.f17993f;
                this.f17991b.lambda$loadRecentAndTopReactions$237(this.f17992c, this.d, sharedPreferences, zArr);
                return;
            default:
                SharedPreferences sharedPreferences2 = this.e;
                boolean[] zArr2 = this.f17993f;
                this.f17991b.lambda$loadRecentAndTopReactions$235(this.f17992c, this.d, sharedPreferences2, zArr2);
                return;
        }
    }
}
