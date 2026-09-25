package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class uf implements Runnable {
    public final int f17696a;
    public final MessagesStorage f17697b;
    public final long f17698c;
    public final boolean[] d;
    public final CountDownLatch e;

    public uf(int i10, long j3, CountDownLatch countDownLatch, MessagesStorage messagesStorage, boolean[] zArr) {
        this.f17696a = i10;
        this.f17697b = messagesStorage;
        this.f17698c = j3;
        this.d = zArr;
        this.e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f17696a) {
            case 0:
                this.f17697b.lambda$checkMessageByRandomId$153(this.f17698c, this.d, this.e);
                return;
            case 1:
                this.f17697b.lambda$isMigratedChat$141(this.f17698c, this.d, this.e);
                return;
            default:
                this.f17697b.lambda$hasInviteMeMessage$143(this.f17698c, this.d, this.e);
                return;
        }
    }
}
