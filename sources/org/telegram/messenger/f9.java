package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f9 implements Runnable {
    public final int f18360a;
    public final MediaDataController f18361b;
    public final TLRPC.TL_error f18362c;
    public final TLObject d;
    public final SharedPreferences e;
    public final boolean[] f18363f;

    public f9(MediaDataController mediaDataController, TLRPC.TL_error tL_error, TLObject tLObject, SharedPreferences sharedPreferences, boolean[] zArr, int i10) {
        this.f18360a = i10;
        this.f18361b = mediaDataController;
        this.f18362c = tL_error;
        this.d = tLObject;
        this.e = sharedPreferences;
        this.f18363f = zArr;
    }

    @Override
    public final void run() {
        switch (this.f18360a) {
            case 0:
                SharedPreferences sharedPreferences = this.e;
                boolean[] zArr = this.f18363f;
                this.f18361b.lambda$loadRecentAndTopReactions$238(this.f18362c, this.d, sharedPreferences, zArr);
                return;
            default:
                SharedPreferences sharedPreferences2 = this.e;
                boolean[] zArr2 = this.f18363f;
                this.f18361b.lambda$loadRecentAndTopReactions$236(this.f18362c, this.d, sharedPreferences2, zArr2);
                return;
        }
    }
}
