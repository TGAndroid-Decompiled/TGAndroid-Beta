package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class xr implements Runnable {
    public final hs f19283a;
    public final String f19284b;
    public final long f19285c;
    public final TLRPC.Reaction d;
    public final int e;
    public final int f19286f;
    public final boolean h;
    public final n20 f19287n;

    public xr(hs hsVar, String str, long j10, TLRPC.Reaction reaction, int i10, int i11, boolean z10, n20 n20Var) {
        this.f19283a = hsVar;
        this.f19284b = str;
        this.f19285c = j10;
        this.d = reaction;
        this.e = i10;
        this.f19286f = i11;
        this.h = z10;
        this.f19287n = n20Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.xr.run():void");
    }
}
