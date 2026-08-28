package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class pf implements Runnable {
    public final int f21241a;
    public final MessagesStorage f21242b;
    public final long f21243c;
    public final boolean[] d;
    public final CountDownLatch f21244e;

    public pf(int i9, long j10, CountDownLatch countDownLatch, MessagesStorage messagesStorage, boolean[] zArr) {
        this.f21241a = i9;
        this.f21242b = messagesStorage;
        this.f21243c = j10;
        this.d = zArr;
        this.f21244e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f21241a) {
            case 0:
                this.f21242b.lambda$checkMessageByRandomId$153(this.f21243c, this.d, this.f21244e);
                return;
            case 1:
                this.f21242b.lambda$isMigratedChat$141(this.f21243c, this.d, this.f21244e);
                return;
            default:
                this.f21242b.lambda$hasInviteMeMessage$143(this.f21243c, this.d, this.f21244e);
                return;
        }
    }
}
