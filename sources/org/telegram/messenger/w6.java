package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class w6 implements Runnable {
    public final int f19465a;
    public final MediaDataController f19466b;
    public final TLRPC.TL_error f19467c;
    public final TLObject d;
    public final SharedPreferences f19468e;
    public final boolean[] f19469f;

    public w6(MediaDataController mediaDataController, TLRPC.TL_error tL_error, TLObject tLObject, SharedPreferences sharedPreferences, boolean[] zArr, int i10) {
        this.f19465a = i10;
        this.f19466b = mediaDataController;
        this.f19467c = tL_error;
        this.d = tLObject;
        this.f19468e = sharedPreferences;
        this.f19469f = zArr;
    }

    @Override
    public final void run() {
        switch (this.f19465a) {
            case 0:
                SharedPreferences sharedPreferences = this.f19468e;
                boolean[] zArr = this.f19469f;
                this.f19466b.lambda$loadRecentAndTopReactions$237(this.f19467c, this.d, sharedPreferences, zArr);
                return;
            default:
                SharedPreferences sharedPreferences2 = this.f19468e;
                boolean[] zArr2 = this.f19469f;
                this.f19466b.lambda$loadRecentAndTopReactions$235(this.f19467c, this.d, sharedPreferences2, zArr2);
                return;
        }
    }
}
