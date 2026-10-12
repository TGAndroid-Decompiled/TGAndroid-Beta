package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class xf implements Runnable {
    public final int f19021a;
    public final MessagesStorage f19022b;
    public final long f19023c;
    public final boolean[] d;
    public final CountDownLatch e;

    public xf(int i10, long j10, CountDownLatch countDownLatch, MessagesStorage messagesStorage, boolean[] zArr) {
        this.f19021a = i10;
        this.f19022b = messagesStorage;
        this.f19023c = j10;
        this.d = zArr;
        this.e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f19021a) {
            case 0:
                this.f19022b.lambda$checkMessageByRandomId$153(this.f19023c, this.d, this.e);
                return;
            case 1:
                this.f19022b.lambda$isMigratedChat$141(this.f19023c, this.d, this.e);
                return;
            default:
                this.f19022b.lambda$hasInviteMeMessage$143(this.f19023c, this.d, this.e);
                return;
        }
    }
}
