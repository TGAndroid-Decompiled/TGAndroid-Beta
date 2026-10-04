package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f9 implements Runnable {
    public final int f17837a;
    public final MediaDataController f17838b;
    public final TLRPC.TL_error f17839c;
    public final TLObject d;
    public final SharedPreferences f17840e;
    public final boolean[] f17841f;

    public f9(MediaDataController mediaDataController, TLRPC.TL_error tL_error, TLObject tLObject, SharedPreferences sharedPreferences, boolean[] zArr, int i10) {
        this.f17837a = i10;
        this.f17838b = mediaDataController;
        this.f17839c = tL_error;
        this.d = tLObject;
        this.f17840e = sharedPreferences;
        this.f17841f = zArr;
    }

    @Override
    public final void run() {
        switch (this.f17837a) {
            case 0:
                SharedPreferences sharedPreferences = this.f17840e;
                boolean[] zArr = this.f17841f;
                this.f17838b.lambda$loadRecentAndTopReactions$238(this.f17839c, this.d, sharedPreferences, zArr);
                return;
            default:
                SharedPreferences sharedPreferences2 = this.f17840e;
                boolean[] zArr2 = this.f17841f;
                this.f17838b.lambda$loadRecentAndTopReactions$236(this.f17839c, this.d, sharedPreferences2, zArr2);
                return;
        }
    }
}
