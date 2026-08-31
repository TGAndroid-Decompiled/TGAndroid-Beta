package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a7 implements Runnable {
    public final int f18116a;
    public final MediaDataController f18117b;
    public final TLRPC.TL_error f18118c;
    public final TLObject d;
    public final SharedPreferences f18119e;
    public final boolean[] f18120f;

    public a7(MediaDataController mediaDataController, TLRPC.TL_error tL_error, TLObject tLObject, SharedPreferences sharedPreferences, boolean[] zArr, int i10) {
        this.f18116a = i10;
        this.f18117b = mediaDataController;
        this.f18118c = tL_error;
        this.d = tLObject;
        this.f18119e = sharedPreferences;
        this.f18120f = zArr;
    }

    @Override
    public final void run() {
        switch (this.f18116a) {
            case 0:
                SharedPreferences sharedPreferences = this.f18119e;
                boolean[] zArr = this.f18120f;
                this.f18117b.lambda$loadRecentAndTopReactions$237(this.f18118c, this.d, sharedPreferences, zArr);
                return;
            default:
                SharedPreferences sharedPreferences2 = this.f18119e;
                boolean[] zArr2 = this.f18120f;
                this.f18117b.lambda$loadRecentAndTopReactions$235(this.f18118c, this.d, sharedPreferences2, zArr2);
                return;
        }
    }
}
