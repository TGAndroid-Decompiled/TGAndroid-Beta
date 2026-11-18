package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class bq implements Runnable {
    public final int f23117a = 0;
    public final tr f23118b;
    public final long f23119c;
    public final long d;
    public final int f23120e;
    public final int f23121f;
    public final Object h;

    public bq(int i7, int i10, long j3, long j10, tr trVar, TLRPC.InputChannel inputChannel) {
        this.f23118b = trVar;
        this.f23119c = j3;
        this.f23120e = i7;
        this.h = inputChannel;
        this.f23121f = i10;
        this.d = j10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.bq.run():void");
    }

    public bq(tr trVar, long j3, long j10, Integer num, int i7, int i10) {
        this.f23118b = trVar;
        this.f23119c = j3;
        this.d = j10;
        this.h = num;
        this.f23120e = i7;
        this.f23121f = i10;
    }

    public bq(org.telegram.ui.Cells.f6 f6Var, int i7, tr trVar, long j3, long j10, int i10) {
        this.h = f6Var;
        this.f23120e = i7;
        this.f23118b = trVar;
        this.f23119c = j3;
        this.d = j10;
        this.f23121f = i10;
    }
}
