package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class xf implements Runnable {
    public final int f20083a;
    public final MessagesStorage f20084b;
    public final long f20085c;
    public final boolean[] d;
    public final CountDownLatch e;

    public xf(int i10, long j10, CountDownLatch countDownLatch, MessagesStorage messagesStorage, boolean[] zArr) {
        this.f20083a = i10;
        this.f20084b = messagesStorage;
        this.f20085c = j10;
        this.d = zArr;
        this.e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f20083a) {
            case 0:
                this.f20084b.lambda$checkMessageByRandomId$153(this.f20085c, this.d, this.e);
                return;
            case 1:
                this.f20084b.lambda$isMigratedChat$141(this.f20085c, this.d, this.e);
                return;
            default:
                this.f20084b.lambda$hasInviteMeMessage$143(this.f20085c, this.d, this.e);
                return;
        }
    }
}
