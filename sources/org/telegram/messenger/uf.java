package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class uf implements Runnable {
    public final int f19353a;
    public final MessagesStorage f19354b;
    public final long f19355c;
    public final boolean[] d;
    public final CountDownLatch f19356e;

    public uf(int i10, long j3, CountDownLatch countDownLatch, MessagesStorage messagesStorage, boolean[] zArr) {
        this.f19353a = i10;
        this.f19354b = messagesStorage;
        this.f19355c = j3;
        this.d = zArr;
        this.f19356e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f19353a) {
            case 0:
                this.f19354b.lambda$checkMessageByRandomId$153(this.f19355c, this.d, this.f19356e);
                return;
            case 1:
                this.f19354b.lambda$isMigratedChat$141(this.f19355c, this.d, this.f19356e);
                return;
            default:
                this.f19354b.lambda$hasInviteMeMessage$143(this.f19355c, this.d, this.f19356e);
                return;
        }
    }
}
