package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class vf implements Runnable {
    public final int f17761a;
    public final MessagesStorage f17762b;
    public final long f17763c;
    public final boolean[] d;
    public final CountDownLatch e;

    public vf(int i10, long j3, CountDownLatch countDownLatch, MessagesStorage messagesStorage, boolean[] zArr) {
        this.f17761a = i10;
        this.f17762b = messagesStorage;
        this.f17763c = j3;
        this.d = zArr;
        this.e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f17761a) {
            case 0:
                this.f17762b.lambda$checkMessageByRandomId$153(this.f17763c, this.d, this.e);
                return;
            case 1:
                this.f17762b.lambda$isMigratedChat$141(this.f17763c, this.d, this.e);
                return;
            default:
                this.f17762b.lambda$hasInviteMeMessage$143(this.f17763c, this.d, this.e);
                return;
        }
    }
}
