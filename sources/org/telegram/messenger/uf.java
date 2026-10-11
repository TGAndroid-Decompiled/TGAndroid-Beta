package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class uf implements Runnable {
    public final int f19387a;
    public final MessagesStorage f19388b;
    public final long f19389c;
    public final boolean[] d;
    public final CountDownLatch f19390e;

    public uf(int i10, long j3, CountDownLatch countDownLatch, MessagesStorage messagesStorage, boolean[] zArr) {
        this.f19387a = i10;
        this.f19388b = messagesStorage;
        this.f19389c = j3;
        this.d = zArr;
        this.f19390e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f19387a) {
            case 0:
                this.f19388b.lambda$checkMessageByRandomId$153(this.f19389c, this.d, this.f19390e);
                return;
            case 1:
                this.f19388b.lambda$isMigratedChat$141(this.f19389c, this.d, this.f19390e);
                return;
            default:
                this.f19388b.lambda$hasInviteMeMessage$143(this.f19389c, this.d, this.f19390e);
                return;
        }
    }
}
