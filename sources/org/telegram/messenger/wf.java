package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class wf implements Runnable {
    public final int f22096a;
    public final MessagesStorage f22097b;
    public final long f22098c;
    public final boolean[] d;
    public final CountDownLatch f22099e;

    public wf(int i10, long j10, CountDownLatch countDownLatch, MessagesStorage messagesStorage, boolean[] zArr) {
        this.f22096a = i10;
        this.f22097b = messagesStorage;
        this.f22098c = j10;
        this.d = zArr;
        this.f22099e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f22096a) {
            case 0:
                this.f22097b.lambda$checkMessageByRandomId$153(this.f22098c, this.d, this.f22099e);
                return;
            case 1:
                this.f22097b.lambda$isMigratedChat$141(this.f22098c, this.d, this.f22099e);
                return;
            default:
                this.f22097b.lambda$hasInviteMeMessage$143(this.f22098c, this.d, this.f22099e);
                return;
        }
    }
}
