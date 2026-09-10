package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class c7 implements Runnable {
    public final int f14843a;
    public final MediaDataController f14844b;
    public final TLRPC.TL_error f14845c;
    public final TLObject d;
    public final SharedPreferences e;
    public final boolean[] f14846f;

    public c7(MediaDataController mediaDataController, TLRPC.TL_error tL_error, TLObject tLObject, SharedPreferences sharedPreferences, boolean[] zArr, int i10) {
        this.f14843a = i10;
        this.f14844b = mediaDataController;
        this.f14845c = tL_error;
        this.d = tLObject;
        this.e = sharedPreferences;
        this.f14846f = zArr;
    }

    @Override
    public final void run() {
        switch (this.f14843a) {
            case 0:
                SharedPreferences sharedPreferences = this.e;
                boolean[] zArr = this.f14846f;
                this.f14844b.lambda$loadRecentAndTopReactions$237(this.f14845c, this.d, sharedPreferences, zArr);
                return;
            default:
                SharedPreferences sharedPreferences2 = this.e;
                boolean[] zArr2 = this.f14846f;
                this.f14844b.lambda$loadRecentAndTopReactions$235(this.f14845c, this.d, sharedPreferences2, zArr2);
                return;
        }
    }
}
