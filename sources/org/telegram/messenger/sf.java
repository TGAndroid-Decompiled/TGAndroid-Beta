package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class sf implements Runnable {
    public final int f19498a;
    public final MessagesStorage f19499b;
    public final long f19500c;
    public final boolean[] d;
    public final CountDownLatch e;

    public sf(int i10, long j10, CountDownLatch countDownLatch, MessagesStorage messagesStorage, boolean[] zArr) {
        this.f19498a = i10;
        this.f19499b = messagesStorage;
        this.f19500c = j10;
        this.d = zArr;
        this.e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f19498a) {
            case 0:
                this.f19499b.lambda$checkMessageByRandomId$153(this.f19500c, this.d, this.e);
                return;
            case 1:
                this.f19499b.lambda$isMigratedChat$141(this.f19500c, this.d, this.e);
                return;
            default:
                this.f19499b.lambda$hasInviteMeMessage$143(this.f19500c, this.d, this.e);
                return;
        }
    }
}
