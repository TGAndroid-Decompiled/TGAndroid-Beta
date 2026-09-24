package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class uf implements Runnable {
    public final int f17681a;
    public final MessagesStorage f17682b;
    public final long f17683c;
    public final boolean[] d;
    public final CountDownLatch e;

    public uf(int i10, long j3, CountDownLatch countDownLatch, MessagesStorage messagesStorage, boolean[] zArr) {
        this.f17681a = i10;
        this.f17682b = messagesStorage;
        this.f17683c = j3;
        this.d = zArr;
        this.e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f17681a) {
            case 0:
                this.f17682b.lambda$checkMessageByRandomId$153(this.f17683c, this.d, this.e);
                return;
            case 1:
                this.f17682b.lambda$isMigratedChat$141(this.f17683c, this.d, this.e);
                return;
            default:
                this.f17682b.lambda$hasInviteMeMessage$143(this.f17683c, this.d, this.e);
                return;
        }
    }
}
