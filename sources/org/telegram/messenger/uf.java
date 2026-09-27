package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class uf implements Runnable {
    public final int f17690a;
    public final MessagesStorage f17691b;
    public final long f17692c;
    public final boolean[] d;
    public final CountDownLatch e;

    public uf(int i10, long j3, CountDownLatch countDownLatch, MessagesStorage messagesStorage, boolean[] zArr) {
        this.f17690a = i10;
        this.f17691b = messagesStorage;
        this.f17692c = j3;
        this.d = zArr;
        this.e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f17690a) {
            case 0:
                this.f17691b.lambda$checkMessageByRandomId$153(this.f17692c, this.d, this.e);
                return;
            case 1:
                this.f17691b.lambda$isMigratedChat$141(this.f17692c, this.d, this.e);
                return;
            default:
                this.f17691b.lambda$hasInviteMeMessage$143(this.f17692c, this.d, this.e);
                return;
        }
    }
}
