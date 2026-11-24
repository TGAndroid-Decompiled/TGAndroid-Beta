package defpackage;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yc7 implements Runnable {
    public final byte a = 0;
    public final boolean b;
    public final long c;
    public final int d;
    public final long e;
    public final Object f;
    public final Object h;
    public final Object n;
    public final Object r;
    public final Object s;

    public yc7(cf7 cf7Var, long j, boolean z, String str, long j2, int i, String str2, String str3, String str4) {
        this.f = cf7Var;
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yc7.run():void");
    }

    public yc7(jva jvaVar, TLObject tLObject, Runnable runnable, TLRPC.TL_error tL_error, boolean z, long j, int i, k47 k47Var, long j2) {
        this.f = jvaVar;
        this.h = tLObject;
        this.n = runnable;
        this.r = tL_error;
        this.b = z;
        this.c = j;
        this.d = i;
        this.s = k47Var;
        this.e = j2;
    }
}
