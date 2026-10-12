package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class xf implements Runnable {
    public final int f19583a;
    public final MessagesStorage f19584b;
    public final long f19585c;
    public final boolean[] d;
    public final CountDownLatch f19586e;

    public xf(int i10, long j3, CountDownLatch countDownLatch, MessagesStorage messagesStorage, boolean[] zArr) {
        this.f19583a = i10;
        this.f19584b = messagesStorage;
        this.f19585c = j3;
        this.d = zArr;
        this.f19586e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f19583a) {
            case 0:
                this.f19584b.lambda$checkMessageByRandomId$153(this.f19585c, this.d, this.f19586e);
                return;
            case 1:
                this.f19584b.lambda$isMigratedChat$141(this.f19585c, this.d, this.f19586e);
                return;
            default:
                this.f19584b.lambda$hasInviteMeMessage$143(this.f19585c, this.d, this.f19586e);
                return;
        }
    }
}
