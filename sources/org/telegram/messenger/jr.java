package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class jr implements Runnable {
    public final tr f24915a;
    public final String f24916b;
    public final long f24917c;
    public final TLRPC.Reaction d;
    public final int f24918e;
    public final int f24919f;
    public final boolean h;
    public final u10 f24920n;

    public jr(tr trVar, String str, long j3, TLRPC.Reaction reaction, int i7, int i10, boolean z10, u10 u10Var) {
        this.f24915a = trVar;
        this.f24916b = str;
        this.f24917c = j3;
        this.d = reaction;
        this.f24918e = i7;
        this.f24919f = i10;
        this.h = z10;
        this.f24920n = u10Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.jr.run():void");
    }
}
