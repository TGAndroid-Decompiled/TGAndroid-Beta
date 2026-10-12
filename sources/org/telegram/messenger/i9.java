package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class i9 implements Runnable {
    public final int f17475a;
    public final MediaDataController f17476b;
    public final TLRPC.TL_error f17477c;
    public final TLObject d;
    public final SharedPreferences e;
    public final boolean[] f17478f;

    public i9(MediaDataController mediaDataController, TLRPC.TL_error tL_error, TLObject tLObject, SharedPreferences sharedPreferences, boolean[] zArr, int i10) {
        this.f17475a = i10;
        this.f17476b = mediaDataController;
        this.f17477c = tL_error;
        this.d = tLObject;
        this.e = sharedPreferences;
        this.f17478f = zArr;
    }

    @Override
    public final void run() {
        switch (this.f17475a) {
            case 0:
                SharedPreferences sharedPreferences = this.e;
                boolean[] zArr = this.f17478f;
                this.f17476b.lambda$loadRecentAndTopReactions$238(this.f17477c, this.d, sharedPreferences, zArr);
                return;
            default:
                SharedPreferences sharedPreferences2 = this.e;
                boolean[] zArr2 = this.f17478f;
                this.f17476b.lambda$loadRecentAndTopReactions$236(this.f17477c, this.d, sharedPreferences2, zArr2);
                return;
        }
    }
}
