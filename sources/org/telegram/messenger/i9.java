package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class i9 implements Runnable {
    public final int f17854a;
    public final MediaDataController f17855b;
    public final TLRPC.TL_error f17856c;
    public final TLObject d;
    public final SharedPreferences f17857e;
    public final boolean[] f17858f;

    public i9(MediaDataController mediaDataController, TLRPC.TL_error tL_error, TLObject tLObject, SharedPreferences sharedPreferences, boolean[] zArr, int i10) {
        this.f17854a = i10;
        this.f17855b = mediaDataController;
        this.f17856c = tL_error;
        this.d = tLObject;
        this.f17857e = sharedPreferences;
        this.f17858f = zArr;
    }

    @Override
    public final void run() {
        switch (this.f17854a) {
            case 0:
                SharedPreferences sharedPreferences = this.f17857e;
                boolean[] zArr = this.f17858f;
                this.f17855b.lambda$loadRecentAndTopReactions$238(this.f17856c, this.d, sharedPreferences, zArr);
                return;
            default:
                SharedPreferences sharedPreferences2 = this.f17857e;
                boolean[] zArr2 = this.f17858f;
                this.f17855b.lambda$loadRecentAndTopReactions$236(this.f17856c, this.d, sharedPreferences2, zArr2);
                return;
        }
    }
}
