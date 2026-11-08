package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class gq implements Runnable {
    public final int f22707a = 0;
    public final yr f22708b;
    public final long f22709c;
    public final long d;
    public final int f22710e;
    public final int f22711f;
    public final Object h;

    public gq(int i7, int i10, long j3, long j10, yr yrVar, TLRPC.InputChannel inputChannel) {
        this.f22708b = yrVar;
        this.f22709c = j3;
        this.f22710e = i7;
        this.h = inputChannel;
        this.f22711f = i10;
        this.d = j10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.gq.run():void");
    }

    public gq(yr yrVar, long j3, long j10, Integer num, int i7, int i10) {
        this.f22708b = yrVar;
        this.f22709c = j3;
        this.d = j10;
        this.h = num;
        this.f22710e = i7;
        this.f22711f = i10;
    }

    public gq(org.telegram.ui.Cells.e6 e6Var, int i7, yr yrVar, long j3, long j10, int i10) {
        this.h = e6Var;
        this.f22710e = i7;
        this.f22708b = yrVar;
        this.f22709c = j3;
        this.d = j10;
        this.f22711f = i10;
    }
}
