package di;

import org.telegram.messenger.fj;
import org.telegram.messenger.tr;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class j8 implements Runnable {
    public final int f9076a = 0;
    public final long f9077b;
    public final boolean f9078c;
    public final long d;
    public final int f9079e;
    public final Object f9080f;
    public final Object h;
    public final Object f9081n;
    public final Object f9082r;
    public final Object f9083s;

    public j8(y8 y8Var, TLObject tLObject, Runnable runnable, TLRPC.TL_error tL_error, boolean z10, long j3, int i7, fj fjVar, long j10) {
        this.f9080f = y8Var;
        this.h = tLObject;
        this.f9081n = runnable;
        this.f9082r = tL_error;
        this.f9078c = z10;
        this.f9077b = j3;
        this.f9079e = i7;
        this.f9083s = fjVar;
        this.d = j10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: di.j8.run():void");
    }

    public j8(tr trVar, long j3, boolean z10, String str, long j10, int i7, String str2, String str3, String str4) {
        this.f9080f = trVar;
        this.f9077b = j3;
        this.f9078c = z10;
        this.h = str;
        this.d = j10;
        this.f9079e = i7;
        this.f9081n = str2;
        this.f9082r = str3;
        this.f9083s = str4;
    }
}
