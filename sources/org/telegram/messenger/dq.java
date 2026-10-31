package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class dq implements Runnable {
    public final int f15292a = 0;
    public final boolean f15293b;
    public final long f15294c;
    public final int d;
    public final long e;
    public final Object f15295f;
    public final Object h;
    public final Object f15296n;
    public final Object f15297r;
    public final Object f15298s;

    public dq(hs hsVar, long j10, boolean z10, String str, long j11, int i10, String str2, String str3, String str4) {
        this.f15295f = hsVar;
        this.f15294c = j10;
        this.f15293b = z10;
        this.h = str;
        this.e = j11;
        this.d = i10;
        this.f15296n = str2;
        this.f15297r = str3;
        this.f15298s = str4;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.dq.run():void");
    }

    public dq(rh.e6 e6Var, TLObject tLObject, Runnable runnable, TLRPC.TL_error tL_error, boolean z10, long j10, int i10, jj jjVar, long j11) {
        this.f15295f = e6Var;
        this.h = tLObject;
        this.f15296n = runnable;
        this.f15297r = tL_error;
        this.f15293b = z10;
        this.f15294c = j10;
        this.d = i10;
        this.f15298s = jjVar;
        this.e = j11;
    }
}
