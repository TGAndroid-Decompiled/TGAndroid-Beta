package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class g9 implements Runnable {
    public final int f18436a;
    public final MediaDataController f18437b;
    public final TLRPC.TL_error f18438c;
    public final TLObject d;
    public final SharedPreferences e;
    public final boolean[] f18439f;

    public g9(MediaDataController mediaDataController, TLRPC.TL_error tL_error, TLObject tLObject, SharedPreferences sharedPreferences, boolean[] zArr, int i10) {
        this.f18436a = i10;
        this.f18437b = mediaDataController;
        this.f18438c = tL_error;
        this.d = tLObject;
        this.e = sharedPreferences;
        this.f18439f = zArr;
    }

    @Override
    public final void run() {
        switch (this.f18436a) {
            case 0:
                SharedPreferences sharedPreferences = this.e;
                boolean[] zArr = this.f18439f;
                this.f18437b.lambda$loadRecentAndTopReactions$238(this.f18438c, this.d, sharedPreferences, zArr);
                return;
            default:
                SharedPreferences sharedPreferences2 = this.e;
                boolean[] zArr2 = this.f18439f;
                this.f18437b.lambda$loadRecentAndTopReactions$236(this.f18438c, this.d, sharedPreferences2, zArr2);
                return;
        }
    }
}
