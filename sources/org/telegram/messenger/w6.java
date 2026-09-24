package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class w6 implements Runnable {
    public final int f17979a;
    public final MediaDataController f17980b;
    public final TLRPC.TL_error f17981c;
    public final TLObject d;
    public final SharedPreferences e;
    public final boolean[] f17982f;

    public w6(MediaDataController mediaDataController, TLRPC.TL_error tL_error, TLObject tLObject, SharedPreferences sharedPreferences, boolean[] zArr, int i10) {
        this.f17979a = i10;
        this.f17980b = mediaDataController;
        this.f17981c = tL_error;
        this.d = tLObject;
        this.e = sharedPreferences;
        this.f17982f = zArr;
    }

    @Override
    public final void run() {
        switch (this.f17979a) {
            case 0:
                SharedPreferences sharedPreferences = this.e;
                boolean[] zArr = this.f17982f;
                this.f17980b.lambda$loadRecentAndTopReactions$237(this.f17981c, this.d, sharedPreferences, zArr);
                return;
            default:
                SharedPreferences sharedPreferences2 = this.e;
                boolean[] zArr2 = this.f17982f;
                this.f17980b.lambda$loadRecentAndTopReactions$235(this.f17981c, this.d, sharedPreferences2, zArr2);
                return;
        }
    }
}
