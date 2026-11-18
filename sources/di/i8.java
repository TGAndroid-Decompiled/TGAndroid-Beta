package di;

import org.telegram.messenger.fj;
import org.telegram.messenger.tr;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class i8 implements Runnable {
    public final int f9024a = 0;
    public final long f9025b;
    public final boolean f9026c;
    public final long d;
    public final int f9027e;
    public final Object f9028f;
    public final Object h;
    public final Object f9029n;
    public final Object f9030r;
    public final Object f9031s;

    public i8(x8 x8Var, TLObject tLObject, Runnable runnable, TLRPC.TL_error tL_error, boolean z10, long j3, int i7, fj fjVar, long j10) {
        this.f9028f = x8Var;
        this.h = tLObject;
        this.f9029n = runnable;
        this.f9030r = tL_error;
        this.f9026c = z10;
        this.f9025b = j3;
        this.f9027e = i7;
        this.f9031s = fjVar;
        this.d = j10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: di.i8.run():void");
    }

    public i8(tr trVar, long j3, boolean z10, String str, long j10, int i7, String str2, String str3, String str4) {
        this.f9028f = trVar;
        this.f9025b = j3;
        this.f9026c = z10;
        this.h = str;
        this.d = j10;
        this.f9027e = i7;
        this.f9029n = str2;
        this.f9030r = str3;
        this.f9031s = str4;
    }
}
