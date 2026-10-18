package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class sf implements Runnable {
    public final int f19501a;
    public final MessagesStorage f19502b;
    public final long f19503c;
    public final boolean[] d;
    public final CountDownLatch e;

    public sf(int i10, long j10, CountDownLatch countDownLatch, MessagesStorage messagesStorage, boolean[] zArr) {
        this.f19501a = i10;
        this.f19502b = messagesStorage;
        this.f19503c = j10;
        this.d = zArr;
        this.e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f19501a) {
            case 0:
                this.f19502b.lambda$checkMessageByRandomId$153(this.f19503c, this.d, this.e);
                return;
            case 1:
                this.f19502b.lambda$isMigratedChat$141(this.f19503c, this.d, this.e);
                return;
            default:
                this.f19502b.lambda$hasInviteMeMessage$143(this.f19503c, this.d, this.e);
                return;
        }
    }
}
