package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class wf implements Runnable {
    public final int f20071a;
    public final MessagesStorage f20072b;
    public final long f20073c;
    public final boolean[] d;
    public final CountDownLatch e;

    public wf(int i10, long j10, CountDownLatch countDownLatch, MessagesStorage messagesStorage, boolean[] zArr) {
        this.f20071a = i10;
        this.f20072b = messagesStorage;
        this.f20073c = j10;
        this.d = zArr;
        this.e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f20071a) {
            case 0:
                this.f20072b.lambda$checkMessageByRandomId$153(this.f20073c, this.d, this.e);
                return;
            case 1:
                this.f20072b.lambda$isMigratedChat$141(this.f20073c, this.d, this.e);
                return;
            default:
                this.f20072b.lambda$hasInviteMeMessage$143(this.f20073c, this.d, this.e);
                return;
        }
    }
}
