package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class vf implements Runnable {
    public final int f17776a;
    public final MessagesStorage f17777b;
    public final long f17778c;
    public final boolean[] d;
    public final CountDownLatch e;

    public vf(int i10, long j3, CountDownLatch countDownLatch, MessagesStorage messagesStorage, boolean[] zArr) {
        this.f17776a = i10;
        this.f17777b = messagesStorage;
        this.f17778c = j3;
        this.d = zArr;
        this.e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f17776a) {
            case 0:
                this.f17777b.lambda$checkMessageByRandomId$153(this.f17778c, this.d, this.e);
                return;
            case 1:
                this.f17777b.lambda$isMigratedChat$141(this.f17778c, this.d, this.e);
                return;
            default:
                this.f17777b.lambda$hasInviteMeMessage$143(this.f17778c, this.d, this.e);
                return;
        }
    }
}
