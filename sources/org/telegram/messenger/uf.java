package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class uf implements Runnable {
    public final int f19352a;
    public final MessagesStorage f19353b;
    public final long f19354c;
    public final boolean[] d;
    public final CountDownLatch f19355e;

    public uf(int i10, long j3, CountDownLatch countDownLatch, MessagesStorage messagesStorage, boolean[] zArr) {
        this.f19352a = i10;
        this.f19353b = messagesStorage;
        this.f19354c = j3;
        this.d = zArr;
        this.f19355e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f19352a) {
            case 0:
                this.f19353b.lambda$checkMessageByRandomId$153(this.f19354c, this.d, this.f19355e);
                return;
            case 1:
                this.f19353b.lambda$isMigratedChat$141(this.f19354c, this.d, this.f19355e);
                return;
            default:
                this.f19353b.lambda$hasInviteMeMessage$143(this.f19354c, this.d, this.f19355e);
                return;
        }
    }
}
