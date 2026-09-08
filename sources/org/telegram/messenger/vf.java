package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class vf implements Runnable {
    public final int f19270a;
    public final MessagesStorage f19271b;
    public final long f19272c;
    public final boolean[] d;
    public final CountDownLatch f19273e;

    public vf(int i10, long j3, CountDownLatch countDownLatch, MessagesStorage messagesStorage, boolean[] zArr) {
        this.f19270a = i10;
        this.f19271b = messagesStorage;
        this.f19272c = j3;
        this.d = zArr;
        this.f19273e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f19270a) {
            case 0:
                this.f19271b.lambda$checkMessageByRandomId$153(this.f19272c, this.d, this.f19273e);
                return;
            case 1:
                this.f19271b.lambda$isMigratedChat$141(this.f19272c, this.d, this.f19273e);
                return;
            default:
                this.f19271b.lambda$hasInviteMeMessage$143(this.f19272c, this.d, this.f19273e);
                return;
        }
    }
}
