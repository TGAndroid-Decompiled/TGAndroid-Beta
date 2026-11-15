package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class lr implements Runnable {
    public final vr f24867a;
    public final String f24868b;
    public final long f24869c;
    public final TLRPC.Reaction d;
    public final int f24870e;
    public final int f24871f;
    public final boolean h;
    public final w10 f24872n;

    public lr(vr vrVar, String str, long j3, TLRPC.Reaction reaction, int i7, int i10, boolean z10, w10 w10Var) {
        this.f24867a = vrVar;
        this.f24868b = str;
        this.f24869c = j3;
        this.d = reaction;
        this.f24870e = i7;
        this.f24871f = i10;
        this.h = z10;
        this.f24872n = w10Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.lr.run():void");
    }
}
