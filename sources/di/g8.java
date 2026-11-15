package di;

import org.telegram.messenger.gj;
import org.telegram.messenger.vr;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class g8 implements Runnable {
    public final int f8609a = 0;
    public final long f8610b;
    public final boolean f8611c;
    public final long d;
    public final int f8612e;
    public final Object f8613f;
    public final Object h;
    public final Object f8614n;
    public final Object f8615r;
    public final Object f8616s;

    public g8(v8 v8Var, TLObject tLObject, Runnable runnable, TLRPC.TL_error tL_error, boolean z10, long j3, int i7, gj gjVar, long j10) {
        this.f8613f = v8Var;
        this.h = tLObject;
        this.f8614n = runnable;
        this.f8615r = tL_error;
        this.f8611c = z10;
        this.f8610b = j3;
        this.f8612e = i7;
        this.f8616s = gjVar;
        this.d = j10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: di.g8.run():void");
    }

    public g8(vr vrVar, long j3, boolean z10, String str, long j10, int i7, String str2, String str3, String str4) {
        this.f8613f = vrVar;
        this.f8610b = j3;
        this.f8611c = z10;
        this.h = str;
        this.d = j10;
        this.f8612e = i7;
        this.f8614n = str2;
        this.f8615r = str3;
        this.f8616s = str4;
    }
}
