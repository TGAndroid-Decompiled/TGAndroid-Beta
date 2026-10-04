package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class uf implements Runnable {
    public final int f19340a;
    public final MessagesStorage f19341b;
    public final long f19342c;
    public final boolean[] d;
    public final CountDownLatch f19343e;

    public uf(int i10, long j3, CountDownLatch countDownLatch, MessagesStorage messagesStorage, boolean[] zArr) {
        this.f19340a = i10;
        this.f19341b = messagesStorage;
        this.f19342c = j3;
        this.d = zArr;
        this.f19343e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f19340a) {
            case 0:
                this.f19341b.lambda$checkMessageByRandomId$153(this.f19342c, this.d, this.f19343e);
                return;
            case 1:
                this.f19341b.lambda$isMigratedChat$141(this.f19342c, this.d, this.f19343e);
                return;
            default:
                this.f19341b.lambda$hasInviteMeMessage$143(this.f19342c, this.d, this.f19343e);
                return;
        }
    }
}
