package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class jr implements Runnable {
    public final tr f24940a;
    public final String f24941b;
    public final long f24942c;
    public final TLRPC.Reaction d;
    public final int f24943e;
    public final int f24944f;
    public final boolean h;
    public final u10 f24945n;

    public jr(tr trVar, String str, long j3, TLRPC.Reaction reaction, int i7, int i10, boolean z10, u10 u10Var) {
        this.f24940a = trVar;
        this.f24941b = str;
        this.f24942c = j3;
        this.d = reaction;
        this.f24943e = i7;
        this.f24944f = i10;
        this.h = z10;
        this.f24945n = u10Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.jr.run():void");
    }
}
