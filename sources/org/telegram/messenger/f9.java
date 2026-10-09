package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f9 implements Runnable {
    public final int f17818a;
    public final MediaDataController f17819b;
    public final TLRPC.TL_error f17820c;
    public final TLObject d;
    public final SharedPreferences f17821e;
    public final boolean[] f17822f;

    public f9(MediaDataController mediaDataController, TLRPC.TL_error tL_error, TLObject tLObject, SharedPreferences sharedPreferences, boolean[] zArr, int i10) {
        this.f17818a = i10;
        this.f17819b = mediaDataController;
        this.f17820c = tL_error;
        this.d = tLObject;
        this.f17821e = sharedPreferences;
        this.f17822f = zArr;
    }

    @Override
    public final void run() {
        switch (this.f17818a) {
            case 0:
                SharedPreferences sharedPreferences = this.f17821e;
                boolean[] zArr = this.f17822f;
                this.f17819b.lambda$loadRecentAndTopReactions$238(this.f17820c, this.d, sharedPreferences, zArr);
                return;
            default:
                SharedPreferences sharedPreferences2 = this.f17821e;
                boolean[] zArr2 = this.f17822f;
                this.f17819b.lambda$loadRecentAndTopReactions$236(this.f17820c, this.d, sharedPreferences2, zArr2);
                return;
        }
    }
}
