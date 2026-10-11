package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f9 implements Runnable {
    public final int f17821a;
    public final MediaDataController f17822b;
    public final TLRPC.TL_error f17823c;
    public final TLObject d;
    public final SharedPreferences f17824e;
    public final boolean[] f17825f;

    public f9(MediaDataController mediaDataController, TLRPC.TL_error tL_error, TLObject tLObject, SharedPreferences sharedPreferences, boolean[] zArr, int i10) {
        this.f17821a = i10;
        this.f17822b = mediaDataController;
        this.f17823c = tL_error;
        this.d = tLObject;
        this.f17824e = sharedPreferences;
        this.f17825f = zArr;
    }

    @Override
    public final void run() {
        switch (this.f17821a) {
            case 0:
                SharedPreferences sharedPreferences = this.f17824e;
                boolean[] zArr = this.f17825f;
                this.f17822b.lambda$loadRecentAndTopReactions$238(this.f17823c, this.d, sharedPreferences, zArr);
                return;
            default:
                SharedPreferences sharedPreferences2 = this.f17824e;
                boolean[] zArr2 = this.f17825f;
                this.f17822b.lambda$loadRecentAndTopReactions$236(this.f17823c, this.d, sharedPreferences2, zArr2);
                return;
        }
    }
}
