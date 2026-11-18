package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class bq implements Runnable {
    public final int f23120a = 0;
    public final tr f23121b;
    public final long f23122c;
    public final long d;
    public final int f23123e;
    public final int f23124f;
    public final Object h;

    public bq(int i7, int i10, long j3, long j10, tr trVar, TLRPC.InputChannel inputChannel) {
        this.f23121b = trVar;
        this.f23122c = j3;
        this.f23123e = i7;
        this.h = inputChannel;
        this.f23124f = i10;
        this.d = j10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.bq.run():void");
    }

    public bq(tr trVar, long j3, long j10, Integer num, int i7, int i10) {
        this.f23121b = trVar;
        this.f23122c = j3;
        this.d = j10;
        this.h = num;
        this.f23123e = i7;
        this.f23124f = i10;
    }

    public bq(org.telegram.ui.Cells.e6 e6Var, int i7, tr trVar, long j3, long j10, int i10) {
        this.h = e6Var;
        this.f23123e = i7;
        this.f23121b = trVar;
        this.f23122c = j3;
        this.d = j10;
        this.f23124f = i10;
    }
}
