package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f9 implements Runnable {
    public final int f17822a;
    public final MediaDataController f17823b;
    public final TLRPC.TL_error f17824c;
    public final TLObject d;
    public final SharedPreferences f17825e;
    public final boolean[] f17826f;

    public f9(MediaDataController mediaDataController, TLRPC.TL_error tL_error, TLObject tLObject, SharedPreferences sharedPreferences, boolean[] zArr, int i10) {
        this.f17822a = i10;
        this.f17823b = mediaDataController;
        this.f17824c = tL_error;
        this.d = tLObject;
        this.f17825e = sharedPreferences;
        this.f17826f = zArr;
    }

    @Override
    public final void run() {
        switch (this.f17822a) {
            case 0:
                SharedPreferences sharedPreferences = this.f17825e;
                boolean[] zArr = this.f17826f;
                this.f17823b.lambda$loadRecentAndTopReactions$238(this.f17824c, this.d, sharedPreferences, zArr);
                return;
            default:
                SharedPreferences sharedPreferences2 = this.f17825e;
                boolean[] zArr2 = this.f17826f;
                this.f17823b.lambda$loadRecentAndTopReactions$236(this.f17824c, this.d, sharedPreferences2, zArr2);
                return;
        }
    }
}
