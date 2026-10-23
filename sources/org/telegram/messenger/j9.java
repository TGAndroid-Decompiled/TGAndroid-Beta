package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class j9 implements Runnable {
    public final int f18685a;
    public final MediaDataController f18686b;
    public final TLRPC.TL_error f18687c;
    public final TLObject d;
    public final SharedPreferences e;
    public final boolean[] f18688f;

    public j9(MediaDataController mediaDataController, TLRPC.TL_error tL_error, TLObject tLObject, SharedPreferences sharedPreferences, boolean[] zArr, int i10) {
        this.f18685a = i10;
        this.f18686b = mediaDataController;
        this.f18687c = tL_error;
        this.d = tLObject;
        this.e = sharedPreferences;
        this.f18688f = zArr;
    }

    @Override
    public final void run() {
        switch (this.f18685a) {
            case 0:
                SharedPreferences sharedPreferences = this.e;
                boolean[] zArr = this.f18688f;
                this.f18686b.lambda$loadRecentAndTopReactions$238(this.f18687c, this.d, sharedPreferences, zArr);
                return;
            default:
                SharedPreferences sharedPreferences2 = this.e;
                boolean[] zArr2 = this.f18688f;
                this.f18686b.lambda$loadRecentAndTopReactions$236(this.f18687c, this.d, sharedPreferences2, zArr2);
                return;
        }
    }
}
