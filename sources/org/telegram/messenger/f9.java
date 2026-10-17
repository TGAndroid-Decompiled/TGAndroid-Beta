package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f9 implements Runnable {
    public final int f18352a;
    public final MediaDataController f18353b;
    public final TLRPC.TL_error f18354c;
    public final TLObject d;
    public final SharedPreferences e;
    public final boolean[] f18355f;

    public f9(MediaDataController mediaDataController, TLRPC.TL_error tL_error, TLObject tLObject, SharedPreferences sharedPreferences, boolean[] zArr, int i10) {
        this.f18352a = i10;
        this.f18353b = mediaDataController;
        this.f18354c = tL_error;
        this.d = tLObject;
        this.e = sharedPreferences;
        this.f18355f = zArr;
    }

    @Override
    public final void run() {
        switch (this.f18352a) {
            case 0:
                SharedPreferences sharedPreferences = this.e;
                boolean[] zArr = this.f18355f;
                this.f18353b.lambda$loadRecentAndTopReactions$238(this.f18354c, this.d, sharedPreferences, zArr);
                return;
            default:
                SharedPreferences sharedPreferences2 = this.e;
                boolean[] zArr2 = this.f18355f;
                this.f18353b.lambda$loadRecentAndTopReactions$236(this.f18354c, this.d, sharedPreferences2, zArr2);
                return;
        }
    }
}
