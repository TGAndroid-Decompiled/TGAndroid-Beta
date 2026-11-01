package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class eq implements Runnable {
    public final int f15627a = 0;
    public final boolean f15628b;
    public final long f15629c;
    public final int d;
    public final long e;
    public final Object f15630f;
    public final Object h;
    public final Object f15631n;
    public final Object f15632r;
    public final Object f15633s;

    public eq(is isVar, long j10, boolean z10, String str, long j11, int i10, String str2, String str3, String str4) {
        this.f15630f = isVar;
        this.f15629c = j10;
        this.f15628b = z10;
        this.h = str;
        this.e = j11;
        this.d = i10;
        this.f15631n = str2;
        this.f15632r = str3;
        this.f15633s = str4;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.eq.run():void");
    }

    public eq(rh.e6 e6Var, TLObject tLObject, Runnable runnable, TLRPC.TL_error tL_error, boolean z10, long j10, int i10, kj kjVar, long j11) {
        this.f15630f = e6Var;
        this.h = tLObject;
        this.f15631n = runnable;
        this.f15632r = tL_error;
        this.f15628b = z10;
        this.f15629c = j10;
        this.d = i10;
        this.f15633s = kjVar;
        this.e = j11;
    }
}
