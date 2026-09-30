package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f9 implements Runnable {
    public final int f16379a;
    public final MediaDataController f16380b;
    public final TLRPC.TL_error f16381c;
    public final TLObject d;
    public final SharedPreferences e;
    public final boolean[] f16382f;

    public f9(MediaDataController mediaDataController, TLRPC.TL_error tL_error, TLObject tLObject, SharedPreferences sharedPreferences, boolean[] zArr, int i10) {
        this.f16379a = i10;
        this.f16380b = mediaDataController;
        this.f16381c = tL_error;
        this.d = tLObject;
        this.e = sharedPreferences;
        this.f16382f = zArr;
    }

    @Override
    public final void run() {
        switch (this.f16379a) {
            case 0:
                SharedPreferences sharedPreferences = this.e;
                boolean[] zArr = this.f16382f;
                this.f16380b.lambda$loadRecentAndTopReactions$238(this.f16381c, this.d, sharedPreferences, zArr);
                return;
            default:
                SharedPreferences sharedPreferences2 = this.e;
                boolean[] zArr2 = this.f16382f;
                this.f16380b.lambda$loadRecentAndTopReactions$236(this.f16381c, this.d, sharedPreferences2, zArr2);
                return;
        }
    }
}
