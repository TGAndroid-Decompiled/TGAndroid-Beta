package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class xf implements Runnable {
    public final int f19584a;
    public final MessagesStorage f19585b;
    public final long f19586c;
    public final boolean[] d;
    public final CountDownLatch f19587e;

    public xf(int i10, long j3, CountDownLatch countDownLatch, MessagesStorage messagesStorage, boolean[] zArr) {
        this.f19584a = i10;
        this.f19585b = messagesStorage;
        this.f19586c = j3;
        this.d = zArr;
        this.f19587e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f19584a) {
            case 0:
                this.f19585b.lambda$checkMessageByRandomId$153(this.f19586c, this.d, this.f19587e);
                return;
            case 1:
                this.f19585b.lambda$isMigratedChat$141(this.f19586c, this.d, this.f19587e);
                return;
            default:
                this.f19585b.lambda$hasInviteMeMessage$143(this.f19586c, this.d, this.f19587e);
                return;
        }
    }
}
