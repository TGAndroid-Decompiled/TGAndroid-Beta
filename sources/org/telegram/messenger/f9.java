package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f9 implements Runnable {
    public final int f17836a;
    public final MediaDataController f17837b;
    public final TLRPC.TL_error f17838c;
    public final TLObject d;
    public final SharedPreferences f17839e;
    public final boolean[] f17840f;

    public f9(MediaDataController mediaDataController, TLRPC.TL_error tL_error, TLObject tLObject, SharedPreferences sharedPreferences, boolean[] zArr, int i10) {
        this.f17836a = i10;
        this.f17837b = mediaDataController;
        this.f17838c = tL_error;
        this.d = tLObject;
        this.f17839e = sharedPreferences;
        this.f17840f = zArr;
    }

    @Override
    public final void run() {
        switch (this.f17836a) {
            case 0:
                SharedPreferences sharedPreferences = this.f17839e;
                boolean[] zArr = this.f17840f;
                this.f17837b.lambda$loadRecentAndTopReactions$238(this.f17838c, this.d, sharedPreferences, zArr);
                return;
            default:
                SharedPreferences sharedPreferences2 = this.f17839e;
                boolean[] zArr2 = this.f17840f;
                this.f17837b.lambda$loadRecentAndTopReactions$236(this.f17838c, this.d, sharedPreferences2, zArr2);
                return;
        }
    }
}
