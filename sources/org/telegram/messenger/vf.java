package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class vf implements Runnable {
    public final int f17547a;
    public final MessagesStorage f17548b;
    public final long f17549c;
    public final boolean[] d;
    public final CountDownLatch e;

    public vf(int i10, long j3, CountDownLatch countDownLatch, MessagesStorage messagesStorage, boolean[] zArr) {
        this.f17547a = i10;
        this.f17548b = messagesStorage;
        this.f17549c = j3;
        this.d = zArr;
        this.e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f17547a) {
            case 0:
                this.f17548b.lambda$checkMessageByRandomId$153(this.f17549c, this.d, this.e);
                return;
            case 1:
                this.f17548b.lambda$isMigratedChat$141(this.f17549c, this.d, this.e);
                return;
            default:
                this.f17548b.lambda$hasInviteMeMessage$143(this.f17549c, this.d, this.e);
                return;
        }
    }
}
