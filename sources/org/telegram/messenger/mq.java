package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class mq implements Runnable {
    public final int f16987a = 0;
    public final hs f16988b;
    public final long f16989c;
    public final long d;
    public final int e;
    public final int f16990f;
    public final Object h;

    public mq(int i10, int i11, long j10, long j11, hs hsVar, TLRPC.InputChannel inputChannel) {
        this.f16988b = hsVar;
        this.f16989c = j10;
        this.e = i10;
        this.h = inputChannel;
        this.f16990f = i11;
        this.d = j11;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.mq.run():void");
    }

    public mq(hs hsVar, long j10, long j11, Integer num, int i10, int i11) {
        this.f16988b = hsVar;
        this.f16989c = j10;
        this.d = j11;
        this.h = num;
        this.e = i10;
        this.f16990f = i11;
    }

    public mq(org.telegram.ui.Cells.i6 i6Var, int i10, hs hsVar, long j10, long j11, int i11) {
        this.h = i6Var;
        this.e = i10;
        this.f16988b = hsVar;
        this.f16989c = j10;
        this.d = j11;
        this.f16990f = i11;
    }
}
