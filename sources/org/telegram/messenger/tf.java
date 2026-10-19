package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class tf implements Runnable {
    public final int f19586a;
    public final MessagesStorage f19587b;
    public final long f19588c;
    public final boolean[] d;
    public final CountDownLatch e;

    public tf(int i10, long j10, CountDownLatch countDownLatch, MessagesStorage messagesStorage, boolean[] zArr) {
        this.f19586a = i10;
        this.f19587b = messagesStorage;
        this.f19588c = j10;
        this.d = zArr;
        this.e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f19586a) {
            case 0:
                this.f19587b.lambda$checkMessageByRandomId$153(this.f19588c, this.d, this.e);
                return;
            case 1:
                this.f19587b.lambda$isMigratedChat$141(this.f19588c, this.d, this.e);
                return;
            default:
                this.f19587b.lambda$hasInviteMeMessage$143(this.f19588c, this.d, this.e);
                return;
        }
    }
}
