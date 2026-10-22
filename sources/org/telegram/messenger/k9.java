package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class k9 implements Runnable {
    public final int f18761a;
    public final MediaDataController f18762b;
    public final TLRPC.TL_error f18763c;
    public final TLObject d;
    public final SharedPreferences e;
    public final boolean[] f18764f;

    public k9(MediaDataController mediaDataController, TLRPC.TL_error tL_error, TLObject tLObject, SharedPreferences sharedPreferences, boolean[] zArr, int i10) {
        this.f18761a = i10;
        this.f18762b = mediaDataController;
        this.f18763c = tL_error;
        this.d = tLObject;
        this.e = sharedPreferences;
        this.f18764f = zArr;
    }

    @Override
    public final void run() {
        switch (this.f18761a) {
            case 0:
                SharedPreferences sharedPreferences = this.e;
                boolean[] zArr = this.f18764f;
                this.f18762b.lambda$loadRecentAndTopReactions$238(this.f18763c, this.d, sharedPreferences, zArr);
                return;
            default:
                SharedPreferences sharedPreferences2 = this.e;
                boolean[] zArr2 = this.f18764f;
                this.f18762b.lambda$loadRecentAndTopReactions$236(this.f18763c, this.d, sharedPreferences2, zArr2);
                return;
        }
    }
}
