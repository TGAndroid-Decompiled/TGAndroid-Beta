package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class v6 implements Runnable {
    public final int f21729a;
    public final MediaDataController f21730b;
    public final TLRPC.TL_error f21731c;
    public final TLObject d;
    public final SharedPreferences f21732e;
    public final boolean[] f21733f;

    public v6(MediaDataController mediaDataController, TLRPC.TL_error tL_error, TLObject tLObject, SharedPreferences sharedPreferences, boolean[] zArr, int i9) {
        this.f21729a = i9;
        this.f21730b = mediaDataController;
        this.f21731c = tL_error;
        this.d = tLObject;
        this.f21732e = sharedPreferences;
        this.f21733f = zArr;
    }

    @Override
    public final void run() {
        switch (this.f21729a) {
            case 0:
                SharedPreferences sharedPreferences = this.f21732e;
                boolean[] zArr = this.f21733f;
                this.f21730b.lambda$loadRecentAndTopReactions$237(this.f21731c, this.d, sharedPreferences, zArr);
                return;
            default:
                SharedPreferences sharedPreferences2 = this.f21732e;
                boolean[] zArr2 = this.f21733f;
                this.f21730b.lambda$loadRecentAndTopReactions$235(this.f21731c, this.d, sharedPreferences2, zArr2);
                return;
        }
    }
}
