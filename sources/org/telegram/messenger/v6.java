package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class v6 implements Runnable {
    public final int f19233a;
    public final MediaDataController f19234b;
    public final TLRPC.TL_error f19235c;
    public final TLObject d;
    public final SharedPreferences f19236e;
    public final boolean[] f19237f;

    public v6(MediaDataController mediaDataController, TLRPC.TL_error tL_error, TLObject tLObject, SharedPreferences sharedPreferences, boolean[] zArr, int i10) {
        this.f19233a = i10;
        this.f19234b = mediaDataController;
        this.f19235c = tL_error;
        this.d = tLObject;
        this.f19236e = sharedPreferences;
        this.f19237f = zArr;
    }

    @Override
    public final void run() {
        switch (this.f19233a) {
            case 0:
                SharedPreferences sharedPreferences = this.f19236e;
                boolean[] zArr = this.f19237f;
                this.f19234b.lambda$loadRecentAndTopReactions$237(this.f19235c, this.d, sharedPreferences, zArr);
                return;
            default:
                SharedPreferences sharedPreferences2 = this.f19236e;
                boolean[] zArr2 = this.f19237f;
                this.f19234b.lambda$loadRecentAndTopReactions$235(this.f19235c, this.d, sharedPreferences2, zArr2);
                return;
        }
    }
}
