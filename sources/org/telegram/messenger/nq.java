package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class nq implements Runnable {
    public final int f17329a = 0;
    public final is f17330b;
    public final long f17331c;
    public final long d;
    public final int e;
    public final int f17332f;
    public final Object h;

    public nq(int i10, int i11, long j10, long j11, is isVar, TLRPC.InputChannel inputChannel) {
        this.f17330b = isVar;
        this.f17331c = j10;
        this.e = i10;
        this.h = inputChannel;
        this.f17332f = i11;
        this.d = j11;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.nq.run():void");
    }

    public nq(is isVar, long j10, long j11, Integer num, int i10, int i11) {
        this.f17330b = isVar;
        this.f17331c = j10;
        this.d = j11;
        this.h = num;
        this.e = i10;
        this.f17332f = i11;
    }

    public nq(org.telegram.ui.Cells.i6 i6Var, int i10, is isVar, long j10, long j11, int i11) {
        this.h = i6Var;
        this.e = i10;
        this.f17330b = isVar;
        this.f17331c = j10;
        this.d = j11;
        this.f17332f = i11;
    }
}
