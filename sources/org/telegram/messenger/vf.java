package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class vf implements Runnable {
    public final int f19243a;
    public final MessagesStorage f19244b;
    public final long f19245c;
    public final boolean[] d;
    public final CountDownLatch f19246e;

    public vf(int i10, long j3, CountDownLatch countDownLatch, MessagesStorage messagesStorage, boolean[] zArr) {
        this.f19243a = i10;
        this.f19244b = messagesStorage;
        this.f19245c = j3;
        this.d = zArr;
        this.f19246e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f19243a) {
            case 0:
                this.f19244b.lambda$checkMessageByRandomId$153(this.f19245c, this.d, this.f19246e);
                return;
            case 1:
                this.f19244b.lambda$isMigratedChat$141(this.f19245c, this.d, this.f19246e);
                return;
            default:
                this.f19244b.lambda$hasInviteMeMessage$143(this.f19245c, this.d, this.f19246e);
                return;
        }
    }
}
