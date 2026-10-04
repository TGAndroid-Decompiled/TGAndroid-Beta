package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class uf implements Runnable {
    public final int f19347a;
    public final MessagesStorage f19348b;
    public final long f19349c;
    public final boolean[] d;
    public final CountDownLatch f19350e;

    public uf(int i10, long j3, CountDownLatch countDownLatch, MessagesStorage messagesStorage, boolean[] zArr) {
        this.f19347a = i10;
        this.f19348b = messagesStorage;
        this.f19349c = j3;
        this.d = zArr;
        this.f19350e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f19347a) {
            case 0:
                this.f19348b.lambda$checkMessageByRandomId$153(this.f19349c, this.d, this.f19350e);
                return;
            case 1:
                this.f19348b.lambda$isMigratedChat$141(this.f19349c, this.d, this.f19350e);
                return;
            default:
                this.f19348b.lambda$hasInviteMeMessage$143(this.f19349c, this.d, this.f19350e);
                return;
        }
    }
}
