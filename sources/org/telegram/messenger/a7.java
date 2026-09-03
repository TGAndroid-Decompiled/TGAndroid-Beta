package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a7 implements Runnable {
    public final int f18118a;
    public final MediaDataController f18119b;
    public final TLRPC.TL_error f18120c;
    public final TLObject d;
    public final SharedPreferences f18121e;
    public final boolean[] f18122f;

    public a7(MediaDataController mediaDataController, TLRPC.TL_error tL_error, TLObject tLObject, SharedPreferences sharedPreferences, boolean[] zArr, int i10) {
        this.f18118a = i10;
        this.f18119b = mediaDataController;
        this.f18120c = tL_error;
        this.d = tLObject;
        this.f18121e = sharedPreferences;
        this.f18122f = zArr;
    }

    @Override
    public final void run() {
        switch (this.f18118a) {
            case 0:
                SharedPreferences sharedPreferences = this.f18121e;
                boolean[] zArr = this.f18122f;
                this.f18119b.lambda$loadRecentAndTopReactions$237(this.f18120c, this.d, sharedPreferences, zArr);
                return;
            default:
                SharedPreferences sharedPreferences2 = this.f18121e;
                boolean[] zArr2 = this.f18122f;
                this.f18119b.lambda$loadRecentAndTopReactions$235(this.f18120c, this.d, sharedPreferences2, zArr2);
                return;
        }
    }
}
