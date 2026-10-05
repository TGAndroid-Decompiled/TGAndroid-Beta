package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f9 implements Runnable {
    public final int f17835a;
    public final MediaDataController f17836b;
    public final TLRPC.TL_error f17837c;
    public final TLObject d;
    public final SharedPreferences f17838e;
    public final boolean[] f17839f;

    public f9(MediaDataController mediaDataController, TLRPC.TL_error tL_error, TLObject tLObject, SharedPreferences sharedPreferences, boolean[] zArr, int i10) {
        this.f17835a = i10;
        this.f17836b = mediaDataController;
        this.f17837c = tL_error;
        this.d = tLObject;
        this.f17838e = sharedPreferences;
        this.f17839f = zArr;
    }

    @Override
    public final void run() {
        switch (this.f17835a) {
            case 0:
                SharedPreferences sharedPreferences = this.f17838e;
                boolean[] zArr = this.f17839f;
                this.f17836b.lambda$loadRecentAndTopReactions$238(this.f17837c, this.d, sharedPreferences, zArr);
                return;
            default:
                SharedPreferences sharedPreferences2 = this.f17838e;
                boolean[] zArr2 = this.f17839f;
                this.f17836b.lambda$loadRecentAndTopReactions$236(this.f17837c, this.d, sharedPreferences2, zArr2);
                return;
        }
    }
}
