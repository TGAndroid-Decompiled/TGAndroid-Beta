package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class jr implements Runnable {
    public final tr f25022a;
    public final String f25023b;
    public final long f25024c;
    public final TLRPC.Reaction d;
    public final int f25025e;
    public final int f25026f;
    public final boolean h;
    public final t10 f25027n;

    public jr(tr trVar, String str, long j3, TLRPC.Reaction reaction, int i7, int i10, boolean z10, t10 t10Var) {
        this.f25022a = trVar;
        this.f25023b = str;
        this.f25024c = j3;
        this.d = reaction;
        this.f25025e = i7;
        this.f25026f = i10;
        this.h = z10;
        this.f25027n = t10Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.jr.run():void");
    }
}
