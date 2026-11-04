package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class wp implements Runnable {
    public final int f26243a;
    public final qr f26244b;
    public final long f26245c;
    public final boolean[] d;
    public final CountDownLatch f26246e;

    public wp(qr qrVar, long j10, boolean[] zArr, CountDownLatch countDownLatch, int i3) {
        this.f26243a = i3;
        this.f26244b = qrVar;
        this.f26245c = j10;
        this.d = zArr;
        this.f26246e = countDownLatch;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.wp.run():void");
    }
}
