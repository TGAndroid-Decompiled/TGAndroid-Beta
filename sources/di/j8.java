package di;

import org.telegram.messenger.fj;
import org.telegram.messenger.tr;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class j8 implements Runnable {
    public final int f9112a = 0;
    public final long f9113b;
    public final boolean f9114c;
    public final long d;
    public final int f9115e;
    public final Object f9116f;
    public final Object h;
    public final Object f9117n;
    public final Object f9118r;
    public final Object f9119s;

    public j8(y8 y8Var, TLObject tLObject, Runnable runnable, TLRPC.TL_error tL_error, boolean z10, long j3, int i7, fj fjVar, long j10) {
        this.f9116f = y8Var;
        this.h = tLObject;
        this.f9117n = runnable;
        this.f9118r = tL_error;
        this.f9114c = z10;
        this.f9113b = j3;
        this.f9115e = i7;
        this.f9119s = fjVar;
        this.d = j10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: di.j8.run():void");
    }

    public j8(tr trVar, long j3, boolean z10, String str, long j10, int i7, String str2, String str3, String str4) {
        this.f9116f = trVar;
        this.f9113b = j3;
        this.f9114c = z10;
        this.h = str;
        this.d = j10;
        this.f9115e = i7;
        this.f9117n = str2;
        this.f9118r = str3;
        this.f9119s = str4;
    }
}
