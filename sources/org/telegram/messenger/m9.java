package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class m9 implements Runnable {
    public final int f20671a;
    public final MediaDataController f20672b;
    public final TLRPC.TL_error f20673c;
    public final TLObject d;
    public final SharedPreferences e;
    public final boolean[] f20674f;

    public m9(MediaDataController mediaDataController, TLRPC.TL_error tL_error, TLObject tLObject, SharedPreferences sharedPreferences, boolean[] zArr, int i10) {
        this.f20671a = i10;
        this.f20672b = mediaDataController;
        this.f20673c = tL_error;
        this.d = tLObject;
        this.e = sharedPreferences;
        this.f20674f = zArr;
    }

    @Override
    public final void run() {
        switch (this.f20671a) {
            case 0:
                SharedPreferences sharedPreferences = this.e;
                boolean[] zArr = this.f20674f;
                this.f20672b.lambda$loadRecentAndTopReactions$238(this.f20673c, this.d, sharedPreferences, zArr);
                return;
            default:
                SharedPreferences sharedPreferences2 = this.e;
                boolean[] zArr2 = this.f20674f;
                this.f20672b.lambda$loadRecentAndTopReactions$236(this.f20673c, this.d, sharedPreferences2, zArr2);
                return;
        }
    }
}
