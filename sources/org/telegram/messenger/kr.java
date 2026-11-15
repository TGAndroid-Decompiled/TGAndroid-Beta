package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class kr implements Runnable {
    public final vr f24749a;
    public final String f24750b;
    public final long f24751c;
    public final TLRPC.Reaction d;
    public final int f24752e;
    public final int f24753f;
    public final boolean h;
    public final w10 f24754n;

    public kr(vr vrVar, String str, long j3, TLRPC.Reaction reaction, int i7, int i10, boolean z10, w10 w10Var) {
        this.f24749a = vrVar;
        this.f24750b = str;
        this.f24751c = j3;
        this.d = reaction;
        this.f24752e = i7;
        this.f24753f = i10;
        this.h = z10;
        this.f24754n = w10Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.kr.run():void");
    }
}
