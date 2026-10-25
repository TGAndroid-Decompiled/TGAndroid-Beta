package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class l9 implements Runnable {
    public final int f20574a;
    public final MediaDataController f20575b;
    public final TLRPC.TL_error f20576c;
    public final TLObject d;
    public final SharedPreferences e;
    public final boolean[] f20577f;

    public l9(MediaDataController mediaDataController, TLRPC.TL_error tL_error, TLObject tLObject, SharedPreferences sharedPreferences, boolean[] zArr, int i10) {
        this.f20574a = i10;
        this.f20575b = mediaDataController;
        this.f20576c = tL_error;
        this.d = tLObject;
        this.e = sharedPreferences;
        this.f20577f = zArr;
    }

    @Override
    public final void run() {
        switch (this.f20574a) {
            case 0:
                SharedPreferences sharedPreferences = this.e;
                boolean[] zArr = this.f20577f;
                this.f20575b.lambda$loadRecentAndTopReactions$238(this.f20576c, this.d, sharedPreferences, zArr);
                return;
            default:
                SharedPreferences sharedPreferences2 = this.e;
                boolean[] zArr2 = this.f20577f;
                this.f20575b.lambda$loadRecentAndTopReactions$236(this.f20576c, this.d, sharedPreferences2, zArr2);
                return;
        }
    }
}
