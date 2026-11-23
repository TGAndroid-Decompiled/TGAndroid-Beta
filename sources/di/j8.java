package di;

import org.telegram.messenger.gj;
import org.telegram.messenger.ur;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class j8 implements Runnable {
    public final int f9115a = 0;
    public final long f9116b;
    public final boolean f9117c;
    public final long d;
    public final int f9118e;
    public final Object f9119f;
    public final Object h;
    public final Object f9120n;
    public final Object f9121r;
    public final Object f9122s;

    public j8(y8 y8Var, TLObject tLObject, Runnable runnable, TLRPC.TL_error tL_error, boolean z10, long j3, int i7, gj gjVar, long j10) {
        this.f9119f = y8Var;
        this.h = tLObject;
        this.f9120n = runnable;
        this.f9121r = tL_error;
        this.f9117c = z10;
        this.f9116b = j3;
        this.f9118e = i7;
        this.f9122s = gjVar;
        this.d = j10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: di.j8.run():void");
    }

    public j8(ur urVar, long j3, boolean z10, String str, long j10, int i7, String str2, String str3, String str4) {
        this.f9119f = urVar;
        this.f9116b = j3;
        this.f9117c = z10;
        this.h = str;
        this.d = j10;
        this.f9118e = i7;
        this.f9120n = str2;
        this.f9121r = str3;
        this.f9122s = str4;
    }
}
