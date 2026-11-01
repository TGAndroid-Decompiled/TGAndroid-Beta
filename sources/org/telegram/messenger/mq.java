package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class mq implements Runnable {
    public final int f17167a;
    public final is f17168b;
    public final long f17169c;
    public final boolean[] d;
    public final CountDownLatch e;

    public mq(is isVar, long j10, boolean[] zArr, CountDownLatch countDownLatch, int i10) {
        this.f17167a = i10;
        this.f17168b = isVar;
        this.f17169c = j10;
        this.d = zArr;
        this.e = countDownLatch;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.mq.run():void");
    }
}
