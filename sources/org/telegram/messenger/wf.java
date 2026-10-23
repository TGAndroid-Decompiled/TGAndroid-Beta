package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class wf implements Runnable {
    public final int f20006a;
    public final MessagesStorage f20007b;
    public final long f20008c;
    public final boolean[] d;
    public final CountDownLatch e;

    public wf(int i10, long j10, CountDownLatch countDownLatch, MessagesStorage messagesStorage, boolean[] zArr) {
        this.f20006a = i10;
        this.f20007b = messagesStorage;
        this.f20008c = j10;
        this.d = zArr;
        this.e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f20006a) {
            case 0:
                this.f20007b.lambda$checkMessageByRandomId$153(this.f20008c, this.d, this.e);
                return;
            case 1:
                this.f20007b.lambda$isMigratedChat$141(this.f20008c, this.d, this.e);
                return;
            default:
                this.f20007b.lambda$hasInviteMeMessage$143(this.f20008c, this.d, this.e);
                return;
        }
    }
}
