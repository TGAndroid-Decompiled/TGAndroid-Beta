package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class dg implements Runnable {
    public final int f15013a;
    public final MessagesStorage f15014b;
    public final long f15015c;
    public final boolean[] d;
    public final CountDownLatch e;

    public dg(int i10, long j3, CountDownLatch countDownLatch, MessagesStorage messagesStorage, boolean[] zArr) {
        this.f15013a = i10;
        this.f15014b = messagesStorage;
        this.f15015c = j3;
        this.d = zArr;
        this.e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f15013a) {
            case 0:
                this.f15014b.lambda$checkMessageByRandomId$153(this.f15015c, this.d, this.e);
                return;
            case 1:
                this.f15014b.lambda$isMigratedChat$141(this.f15015c, this.d, this.e);
                return;
            default:
                this.f15014b.lambda$hasInviteMeMessage$143(this.f15015c, this.d, this.e);
                return;
        }
    }
}
