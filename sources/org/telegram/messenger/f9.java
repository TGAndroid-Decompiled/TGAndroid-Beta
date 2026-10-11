package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f9 implements Runnable {
    public final int f17857a;
    public final MediaDataController f17858b;
    public final TLRPC.TL_error f17859c;
    public final TLObject d;
    public final SharedPreferences f17860e;
    public final boolean[] f17861f;

    public f9(MediaDataController mediaDataController, TLRPC.TL_error tL_error, TLObject tLObject, SharedPreferences sharedPreferences, boolean[] zArr, int i10) {
        this.f17857a = i10;
        this.f17858b = mediaDataController;
        this.f17859c = tL_error;
        this.d = tLObject;
        this.f17860e = sharedPreferences;
        this.f17861f = zArr;
    }

    @Override
    public final void run() {
        switch (this.f17857a) {
            case 0:
                SharedPreferences sharedPreferences = this.f17860e;
                boolean[] zArr = this.f17861f;
                this.f17858b.lambda$loadRecentAndTopReactions$238(this.f17859c, this.d, sharedPreferences, zArr);
                return;
            default:
                SharedPreferences sharedPreferences2 = this.f17860e;
                boolean[] zArr2 = this.f17861f;
                this.f17858b.lambda$loadRecentAndTopReactions$236(this.f17859c, this.d, sharedPreferences2, zArr2);
                return;
        }
    }
}
