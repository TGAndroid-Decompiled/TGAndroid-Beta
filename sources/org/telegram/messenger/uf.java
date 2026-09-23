package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class uf implements Runnable {
    public final int f17449a;
    public final MessagesStorage f17450b;
    public final long f17451c;
    public final boolean[] d;
    public final CountDownLatch e;

    public uf(int i10, long j3, CountDownLatch countDownLatch, MessagesStorage messagesStorage, boolean[] zArr) {
        this.f17449a = i10;
        this.f17450b = messagesStorage;
        this.f17451c = j3;
        this.d = zArr;
        this.e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f17449a) {
            case 0:
                this.f17450b.lambda$checkMessageByRandomId$153(this.f17451c, this.d, this.e);
                return;
            case 1:
                this.f17450b.lambda$isMigratedChat$141(this.f17451c, this.d, this.e);
                return;
            default:
                this.f17450b.lambda$hasInviteMeMessage$143(this.f17451c, this.d, this.e);
                return;
        }
    }
}
