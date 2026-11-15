package di;

import org.telegram.messenger.gj;
import org.telegram.messenger.vr;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f8 implements Runnable {
    public final int f8553a = 0;
    public final long f8554b;
    public final boolean f8555c;
    public final long d;
    public final int f8556e;
    public final Object f8557f;
    public final Object h;
    public final Object f8558n;
    public final Object f8559r;
    public final Object f8560s;

    public f8(u8 u8Var, TLObject tLObject, Runnable runnable, TLRPC.TL_error tL_error, boolean z10, long j3, int i7, gj gjVar, long j10) {
        this.f8557f = u8Var;
        this.h = tLObject;
        this.f8558n = runnable;
        this.f8559r = tL_error;
        this.f8555c = z10;
        this.f8554b = j3;
        this.f8556e = i7;
        this.f8560s = gjVar;
        this.d = j10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: di.f8.run():void");
    }

    public f8(vr vrVar, long j3, boolean z10, String str, long j10, int i7, String str2, String str3, String str4) {
        this.f8557f = vrVar;
        this.f8554b = j3;
        this.f8555c = z10;
        this.h = str;
        this.d = j10;
        this.f8556e = i7;
        this.f8558n = str2;
        this.f8559r = str3;
        this.f8560s = str4;
    }
}
