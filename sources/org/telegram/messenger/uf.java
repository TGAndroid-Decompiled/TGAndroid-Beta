package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class uf implements Runnable {
    public final int f19169a;
    public final MessagesStorage f19170b;
    public final long f19171c;
    public final boolean[] d;
    public final CountDownLatch f19172e;

    public uf(int i10, long j3, CountDownLatch countDownLatch, MessagesStorage messagesStorage, boolean[] zArr) {
        this.f19169a = i10;
        this.f19170b = messagesStorage;
        this.f19171c = j3;
        this.d = zArr;
        this.f19172e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f19169a) {
            case 0:
                this.f19170b.lambda$checkMessageByRandomId$153(this.f19171c, this.d, this.f19172e);
                return;
            case 1:
                this.f19170b.lambda$isMigratedChat$141(this.f19171c, this.d, this.f19172e);
                return;
            default:
                this.f19170b.lambda$hasInviteMeMessage$143(this.f19171c, this.d, this.f19172e);
                return;
        }
    }
}
