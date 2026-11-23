package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class cq implements Runnable {
    public final int f23323a = 0;
    public final ur f23324b;
    public final long f23325c;
    public final long d;
    public final int f23326e;
    public final int f23327f;
    public final Object h;

    public cq(int i7, int i10, long j3, long j10, ur urVar, TLRPC.InputChannel inputChannel) {
        this.f23324b = urVar;
        this.f23325c = j3;
        this.f23326e = i7;
        this.h = inputChannel;
        this.f23327f = i10;
        this.d = j10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.cq.run():void");
    }

    public cq(ur urVar, long j3, long j10, Integer num, int i7, int i10) {
        this.f23324b = urVar;
        this.f23325c = j3;
        this.d = j10;
        this.h = num;
        this.f23326e = i7;
        this.f23327f = i10;
    }

    public cq(org.telegram.ui.Cells.f6 f6Var, int i7, ur urVar, long j3, long j10, int i10) {
        this.h = f6Var;
        this.f23326e = i7;
        this.f23324b = urVar;
        this.f23325c = j3;
        this.d = j10;
        this.f23327f = i10;
    }
}
