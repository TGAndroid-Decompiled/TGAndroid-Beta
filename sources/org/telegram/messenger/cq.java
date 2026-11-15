package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class cq implements Runnable {
    public final int f22919a;
    public final vr f22920b;
    public final long f22921c;
    public final boolean[] d;
    public final CountDownLatch f22922e;

    public cq(vr vrVar, long j3, boolean[] zArr, CountDownLatch countDownLatch, int i7) {
        this.f22919a = i7;
        this.f22920b = vrVar;
        this.f22921c = j3;
        this.d = zArr;
        this.f22922e = countDownLatch;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.cq.run():void");
    }
}
