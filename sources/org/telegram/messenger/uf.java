package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class uf implements Runnable {
    public final int f19196a;
    public final MessagesStorage f19197b;
    public final long f19198c;
    public final boolean[] d;
    public final CountDownLatch f19199e;

    public uf(int i10, long j3, CountDownLatch countDownLatch, MessagesStorage messagesStorage, boolean[] zArr) {
        this.f19196a = i10;
        this.f19197b = messagesStorage;
        this.f19198c = j3;
        this.d = zArr;
        this.f19199e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f19196a) {
            case 0:
                this.f19197b.lambda$checkMessageByRandomId$153(this.f19198c, this.d, this.f19199e);
                return;
            case 1:
                this.f19197b.lambda$isMigratedChat$141(this.f19198c, this.d, this.f19199e);
                return;
            default:
                this.f19197b.lambda$hasInviteMeMessage$143(this.f19198c, this.d, this.f19199e);
                return;
        }
    }
}
