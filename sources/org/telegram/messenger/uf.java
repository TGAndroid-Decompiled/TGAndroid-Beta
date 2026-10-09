package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class uf implements Runnable {
    public final int f19349a;
    public final MessagesStorage f19350b;
    public final long f19351c;
    public final boolean[] d;
    public final CountDownLatch f19352e;

    public uf(int i10, long j3, CountDownLatch countDownLatch, MessagesStorage messagesStorage, boolean[] zArr) {
        this.f19349a = i10;
        this.f19350b = messagesStorage;
        this.f19351c = j3;
        this.d = zArr;
        this.f19352e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f19349a) {
            case 0:
                this.f19350b.lambda$checkMessageByRandomId$153(this.f19351c, this.d, this.f19352e);
                return;
            case 1:
                this.f19350b.lambda$isMigratedChat$141(this.f19351c, this.d, this.f19352e);
                return;
            default:
                this.f19350b.lambda$hasInviteMeMessage$143(this.f19351c, this.d, this.f19352e);
                return;
        }
    }
}
