package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class v6 implements Runnable {
    public final int f19206a;
    public final MediaDataController f19207b;
    public final TLRPC.TL_error f19208c;
    public final TLObject d;
    public final SharedPreferences f19209e;
    public final boolean[] f19210f;

    public v6(MediaDataController mediaDataController, TLRPC.TL_error tL_error, TLObject tLObject, SharedPreferences sharedPreferences, boolean[] zArr, int i10) {
        this.f19206a = i10;
        this.f19207b = mediaDataController;
        this.f19208c = tL_error;
        this.d = tLObject;
        this.f19209e = sharedPreferences;
        this.f19210f = zArr;
    }

    @Override
    public final void run() {
        switch (this.f19206a) {
            case 0:
                SharedPreferences sharedPreferences = this.f19209e;
                boolean[] zArr = this.f19210f;
                this.f19207b.lambda$loadRecentAndTopReactions$237(this.f19208c, this.d, sharedPreferences, zArr);
                return;
            default:
                SharedPreferences sharedPreferences2 = this.f19209e;
                boolean[] zArr2 = this.f19210f;
                this.f19207b.lambda$loadRecentAndTopReactions$235(this.f19208c, this.d, sharedPreferences2, zArr2);
                return;
        }
    }
}
