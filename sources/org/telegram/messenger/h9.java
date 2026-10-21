package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class h9 implements Runnable {
    public final int f18520a;
    public final MediaDataController f18521b;
    public final TLRPC.TL_error f18522c;
    public final TLObject d;
    public final SharedPreferences e;
    public final boolean[] f18523f;

    public h9(MediaDataController mediaDataController, TLRPC.TL_error tL_error, TLObject tLObject, SharedPreferences sharedPreferences, boolean[] zArr, int i10) {
        this.f18520a = i10;
        this.f18521b = mediaDataController;
        this.f18522c = tL_error;
        this.d = tLObject;
        this.e = sharedPreferences;
        this.f18523f = zArr;
    }

    @Override
    public final void run() {
        switch (this.f18520a) {
            case 0:
                SharedPreferences sharedPreferences = this.e;
                boolean[] zArr = this.f18523f;
                this.f18521b.lambda$loadRecentAndTopReactions$238(this.f18522c, this.d, sharedPreferences, zArr);
                return;
            default:
                SharedPreferences sharedPreferences2 = this.e;
                boolean[] zArr2 = this.f18523f;
                this.f18521b.lambda$loadRecentAndTopReactions$236(this.f18522c, this.d, sharedPreferences2, zArr2);
                return;
        }
    }
}
