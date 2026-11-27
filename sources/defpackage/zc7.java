package defpackage;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zc7 implements Runnable {
    public final byte a = 1;
    public final boolean b;
    public final long c;
    public final int d;
    public final long e;
    public final Object f;
    public final Object h;
    public final Object n;
    public final Object r;
    public final Object s;

    public zc7(kf7 kf7Var, long j, boolean z, String str, long j2, int i, String str2, String str3, String str4) {
        this.f = kf7Var;
        this.c = j;
        this.b = z;
        this.h = str;
        this.e = j2;
        this.d = i;
        this.n = str2;
        this.r = str3;
        this.s = str4;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zc7.run():void");
    }

    public zc7(jxa jxaVar, TLObject tLObject, Runnable runnable, TLRPC.TL_error tL_error, boolean z, long j, int i, r47 r47Var, long j2) {
        this.f = jxaVar;
        this.h = tLObject;
        this.n = runnable;
        this.r = tL_error;
        this.b = z;
        this.c = j;
        this.d = i;
        this.s = r47Var;
        this.e = j2;
    }
}
