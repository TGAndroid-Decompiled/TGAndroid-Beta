package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class dq implements Runnable {
    public final int f23119a = 0;
    public final vr f23120b;
    public final long f23121c;
    public final long d;
    public final int f23122e;
    public final int f23123f;
    public final Object h;

    public dq(int i7, int i10, long j3, long j10, vr vrVar, TLRPC.InputChannel inputChannel) {
        this.f23120b = vrVar;
        this.f23121c = j3;
        this.f23122e = i7;
        this.h = inputChannel;
        this.f23123f = i10;
        this.d = j10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.dq.run():void");
    }

    public dq(vr vrVar, long j3, long j10, Integer num, int i7, int i10) {
        this.f23120b = vrVar;
        this.f23121c = j3;
        this.d = j10;
        this.h = num;
        this.f23122e = i7;
        this.f23123f = i10;
    }

    public dq(org.telegram.ui.Cells.d6 d6Var, int i7, vr vrVar, long j3, long j10, int i10) {
        this.h = d6Var;
        this.f23122e = i7;
        this.f23120b = vrVar;
        this.f23121c = j3;
        this.d = j10;
        this.f23123f = i10;
    }
}
