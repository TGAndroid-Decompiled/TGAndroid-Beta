package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;

public final class tf implements Runnable {

    public final int f21638a;

    public final MessagesStorage f21639b;

    public final long f21640c;
    public final boolean[] d;

    public final CountDownLatch f21641e;

    public tf(int i10, long j10, CountDownLatch countDownLatch, MessagesStorage messagesStorage, boolean[] zArr) {
        this.f21638a = i10;
        this.f21639b = messagesStorage;
        this.f21640c = j10;
        this.d = zArr;
        this.f21641e = countDownLatch;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.f21638a) {
            case 0:
                this.f21639b.lambda$checkMessageByRandomId$153(this.f21640c, this.d, this.f21641e);
                break;
            case 1:
                this.f21639b.lambda$isMigratedChat$141(this.f21640c, this.d, this.f21641e);
                break;
            default:
                this.f21639b.lambda$hasInviteMeMessage$143(this.f21640c, this.d, this.f21641e);
                break;
        }
    }
}
