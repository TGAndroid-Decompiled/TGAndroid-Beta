package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class w6 implements Runnable {
    public final int f19492a;
    public final MediaDataController f19493b;
    public final TLRPC.TL_error f19494c;
    public final TLObject d;
    public final SharedPreferences f19495e;
    public final boolean[] f19496f;

    public w6(MediaDataController mediaDataController, TLRPC.TL_error tL_error, TLObject tLObject, SharedPreferences sharedPreferences, boolean[] zArr, int i10) {
        this.f19492a = i10;
        this.f19493b = mediaDataController;
        this.f19494c = tL_error;
        this.d = tLObject;
        this.f19495e = sharedPreferences;
        this.f19496f = zArr;
    }

    @Override
    public final void run() {
        switch (this.f19492a) {
            case 0:
                SharedPreferences sharedPreferences = this.f19495e;
                boolean[] zArr = this.f19496f;
                this.f19493b.lambda$loadRecentAndTopReactions$237(this.f19494c, this.d, sharedPreferences, zArr);
                return;
            default:
                SharedPreferences sharedPreferences2 = this.f19495e;
                boolean[] zArr2 = this.f19496f;
                this.f19493b.lambda$loadRecentAndTopReactions$235(this.f19494c, this.d, sharedPreferences2, zArr2);
                return;
        }
    }
}
