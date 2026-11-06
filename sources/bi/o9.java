package bi;

import org.telegram.messenger.ij;
import org.telegram.messenger.yr;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class o9 implements Runnable {
    public final int f4484a = 0;
    public final long f4485b;
    public final boolean f4486c;
    public final long d;
    public final int f4487e;
    public final Object f4488f;
    public final Object h;
    public final Object f4489n;
    public final Object f4490r;
    public final Object f4491s;

    public o9(ea eaVar, TLObject tLObject, Runnable runnable, TLRPC.TL_error tL_error, boolean z9, long j3, int i7, ij ijVar, long j10) {
        this.f4488f = eaVar;
        this.h = tLObject;
        this.f4489n = runnable;
        this.f4490r = tL_error;
        this.f4486c = z9;
        this.f4485b = j3;
        this.f4487e = i7;
        this.f4491s = ijVar;
        this.d = j10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: bi.o9.run():void");
    }

    public o9(yr yrVar, long j3, boolean z9, String str, long j10, int i7, String str2, String str3, String str4) {
        this.f4488f = yrVar;
        this.f4485b = j3;
        this.f4486c = z9;
        this.h = str;
        this.d = j10;
        this.f4487e = i7;
        this.f4489n = str2;
        this.f4490r = str3;
        this.f4491s = str4;
    }
}
