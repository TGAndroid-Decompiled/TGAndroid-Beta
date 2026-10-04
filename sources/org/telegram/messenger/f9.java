package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f9 implements Runnable {
    public final int f17830a;
    public final MediaDataController f17831b;
    public final TLRPC.TL_error f17832c;
    public final TLObject d;
    public final SharedPreferences f17833e;
    public final boolean[] f17834f;

    public f9(MediaDataController mediaDataController, TLRPC.TL_error tL_error, TLObject tLObject, SharedPreferences sharedPreferences, boolean[] zArr, int i10) {
        this.f17830a = i10;
        this.f17831b = mediaDataController;
        this.f17832c = tL_error;
        this.d = tLObject;
        this.f17833e = sharedPreferences;
        this.f17834f = zArr;
    }

    @Override
    public final void run() {
        switch (this.f17830a) {
            case 0:
                SharedPreferences sharedPreferences = this.f17833e;
                boolean[] zArr = this.f17834f;
                this.f17831b.lambda$loadRecentAndTopReactions$238(this.f17832c, this.d, sharedPreferences, zArr);
                return;
            default:
                SharedPreferences sharedPreferences2 = this.f17833e;
                boolean[] zArr2 = this.f17834f;
                this.f17831b.lambda$loadRecentAndTopReactions$236(this.f17832c, this.d, sharedPreferences2, zArr2);
                return;
        }
    }
}
