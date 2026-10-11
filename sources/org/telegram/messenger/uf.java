package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class uf implements Runnable {
    public final int f19351a;
    public final MessagesStorage f19352b;
    public final long f19353c;
    public final boolean[] d;
    public final CountDownLatch f19354e;

    public uf(int i10, long j3, CountDownLatch countDownLatch, MessagesStorage messagesStorage, boolean[] zArr) {
        this.f19351a = i10;
        this.f19352b = messagesStorage;
        this.f19353c = j3;
        this.d = zArr;
        this.f19354e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f19351a) {
            case 0:
                this.f19352b.lambda$checkMessageByRandomId$153(this.f19353c, this.d, this.f19354e);
                return;
            case 1:
                this.f19352b.lambda$isMigratedChat$141(this.f19353c, this.d, this.f19354e);
                return;
            default:
                this.f19352b.lambda$hasInviteMeMessage$143(this.f19353c, this.d, this.f19354e);
                return;
        }
    }
}
