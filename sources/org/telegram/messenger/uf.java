package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class uf implements Runnable {
    public final int f19673a;
    public final MessagesStorage f19674b;
    public final long f19675c;
    public final boolean[] d;
    public final CountDownLatch e;

    public uf(int i10, long j10, CountDownLatch countDownLatch, MessagesStorage messagesStorage, boolean[] zArr) {
        this.f19673a = i10;
        this.f19674b = messagesStorage;
        this.f19675c = j10;
        this.d = zArr;
        this.e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f19673a) {
            case 0:
                this.f19674b.lambda$checkMessageByRandomId$153(this.f19675c, this.d, this.e);
                return;
            case 1:
                this.f19674b.lambda$isMigratedChat$141(this.f19675c, this.d, this.e);
                return;
            default:
                this.f19674b.lambda$hasInviteMeMessage$143(this.f19675c, this.d, this.e);
                return;
        }
    }
}
