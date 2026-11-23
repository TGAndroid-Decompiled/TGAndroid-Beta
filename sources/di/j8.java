package di;

import org.telegram.messenger.gj;
import org.telegram.messenger.ur;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class j8 implements Runnable {
    public final int f9080a = 0;
    public final long f9081b;
    public final boolean f9082c;
    public final long d;
    public final int f9083e;
    public final Object f9084f;
    public final Object h;
    public final Object f9085n;
    public final Object f9086r;
    public final Object f9087s;

    public j8(y8 y8Var, TLObject tLObject, Runnable runnable, TLRPC.TL_error tL_error, boolean z10, long j3, int i7, gj gjVar, long j10) {
        this.f9084f = y8Var;
        this.h = tLObject;
        this.f9085n = runnable;
        this.f9086r = tL_error;
        this.f9082c = z10;
        this.f9081b = j3;
        this.f9083e = i7;
        this.f9087s = gjVar;
        this.d = j10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: di.j8.run():void");
    }

    public j8(ur urVar, long j3, boolean z10, String str, long j10, int i7, String str2, String str3, String str4) {
        this.f9084f = urVar;
        this.f9081b = j3;
        this.f9082c = z10;
        this.h = str;
        this.d = j10;
        this.f9083e = i7;
        this.f9085n = str2;
        this.f9086r = str3;
        this.f9087s = str4;
    }
}
