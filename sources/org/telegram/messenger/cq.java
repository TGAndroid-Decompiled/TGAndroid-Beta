package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class cq implements Runnable {
    public final int f22923a = 0;
    public final vr f22924b;
    public final long f22925c;
    public final long d;
    public final int f22926e;
    public final int f22927f;
    public final Object h;

    public cq(int i7, int i10, long j3, long j10, vr vrVar, TLRPC.InputChannel inputChannel) {
        this.f22924b = vrVar;
        this.f22925c = j3;
        this.f22926e = i7;
        this.h = inputChannel;
        this.f22927f = i10;
        this.d = j10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.cq.run():void");
    }

    public cq(vr vrVar, long j3, long j10, Integer num, int i7, int i10) {
        this.f22924b = vrVar;
        this.f22925c = j3;
        this.d = j10;
        this.h = num;
        this.f22926e = i7;
        this.f22927f = i10;
    }

    public cq(org.telegram.ui.Cells.d6 d6Var, int i7, vr vrVar, long j3, long j10, int i10) {
        this.h = d6Var;
        this.f22926e = i7;
        this.f22924b = vrVar;
        this.f22925c = j3;
        this.d = j10;
        this.f22927f = i10;
    }
}
