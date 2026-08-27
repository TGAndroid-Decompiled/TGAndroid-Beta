package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class x6 implements Runnable {

    public final int f22106a;

    public final MediaDataController f22107b;

    public final TLRPC.TL_error f22108c;
    public final TLObject d;

    public final SharedPreferences f22109e;

    public final boolean[] f22110f;

    public x6(MediaDataController mediaDataController, TLRPC.TL_error tL_error, TLObject tLObject, SharedPreferences sharedPreferences, boolean[] zArr, int i10) {
        this.f22106a = i10;
        this.f22107b = mediaDataController;
        this.f22108c = tL_error;
        this.d = tLObject;
        this.f22109e = sharedPreferences;
        this.f22110f = zArr;
    }

    @Override
    public final void run() {
        switch (this.f22106a) {
            case 0:
                SharedPreferences sharedPreferences = this.f22109e;
                boolean[] zArr = this.f22110f;
                this.f22107b.lambda$loadRecentAndTopReactions$237(this.f22108c, this.d, sharedPreferences, zArr);
                break;
            default:
                SharedPreferences sharedPreferences2 = this.f22109e;
                boolean[] zArr2 = this.f22110f;
                this.f22107b.lambda$loadRecentAndTopReactions$235(this.f22108c, this.d, sharedPreferences2, zArr2);
                break;
        }
    }
}
