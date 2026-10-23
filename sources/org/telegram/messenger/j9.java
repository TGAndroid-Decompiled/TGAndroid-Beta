package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class j9 implements Runnable {
    public final int f18751a;
    public final MediaDataController f18752b;
    public final TLRPC.TL_error f18753c;
    public final TLObject d;
    public final SharedPreferences e;
    public final boolean[] f18754f;

    public j9(MediaDataController mediaDataController, TLRPC.TL_error tL_error, TLObject tLObject, SharedPreferences sharedPreferences, boolean[] zArr, int i10) {
        this.f18751a = i10;
        this.f18752b = mediaDataController;
        this.f18753c = tL_error;
        this.d = tLObject;
        this.e = sharedPreferences;
        this.f18754f = zArr;
    }

    @Override
    public final void run() {
        switch (this.f18751a) {
            case 0:
                SharedPreferences sharedPreferences = this.e;
                boolean[] zArr = this.f18754f;
                this.f18752b.lambda$loadRecentAndTopReactions$238(this.f18753c, this.d, sharedPreferences, zArr);
                return;
            default:
                SharedPreferences sharedPreferences2 = this.e;
                boolean[] zArr2 = this.f18754f;
                this.f18752b.lambda$loadRecentAndTopReactions$236(this.f18753c, this.d, sharedPreferences2, zArr2);
                return;
        }
    }
}
