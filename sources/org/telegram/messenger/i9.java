package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class i9 implements Runnable {
    public final int f17171a;
    public final MediaDataController f17172b;
    public final TLRPC.TL_error f17173c;
    public final TLObject d;
    public final SharedPreferences e;
    public final boolean[] f17174f;

    public i9(MediaDataController mediaDataController, TLRPC.TL_error tL_error, TLObject tLObject, SharedPreferences sharedPreferences, boolean[] zArr, int i10) {
        this.f17171a = i10;
        this.f17172b = mediaDataController;
        this.f17173c = tL_error;
        this.d = tLObject;
        this.e = sharedPreferences;
        this.f17174f = zArr;
    }

    @Override
    public final void run() {
        switch (this.f17171a) {
            case 0:
                SharedPreferences sharedPreferences = this.e;
                boolean[] zArr = this.f17174f;
                this.f17172b.lambda$loadRecentAndTopReactions$238(this.f17173c, this.d, sharedPreferences, zArr);
                return;
            default:
                SharedPreferences sharedPreferences2 = this.e;
                boolean[] zArr2 = this.f17174f;
                this.f17172b.lambda$loadRecentAndTopReactions$236(this.f17173c, this.d, sharedPreferences2, zArr2);
                return;
        }
    }
}
