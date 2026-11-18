package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class jr implements Runnable {
    public final tr f24912a;
    public final String f24913b;
    public final long f24914c;
    public final TLRPC.Reaction d;
    public final int f24915e;
    public final int f24916f;
    public final boolean h;
    public final u10 f24917n;

    public jr(tr trVar, String str, long j3, TLRPC.Reaction reaction, int i7, int i10, boolean z10, u10 u10Var) {
        this.f24912a = trVar;
        this.f24913b = str;
        this.f24914c = j3;
        this.d = reaction;
        this.f24915e = i7;
        this.f24916f = i10;
        this.h = z10;
        this.f24917n = u10Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.jr.run():void");
    }
}
