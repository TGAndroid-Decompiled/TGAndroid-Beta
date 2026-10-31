package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class lq implements Runnable {
    public final int f16783a;
    public final hs f16784b;
    public final long f16785c;
    public final boolean[] d;
    public final CountDownLatch e;

    public lq(hs hsVar, long j10, boolean[] zArr, CountDownLatch countDownLatch, int i10) {
        this.f16783a = i10;
        this.f16784b = hsVar;
        this.f16785c = j10;
        this.d = zArr;
        this.e = countDownLatch;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.lq.run():void");
    }
}
