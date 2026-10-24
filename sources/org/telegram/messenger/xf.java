package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class xf implements Runnable {
    public final int f20148a;
    public final MessagesStorage f20149b;
    public final long f20150c;
    public final boolean[] d;
    public final CountDownLatch e;

    public xf(int i10, long j10, CountDownLatch countDownLatch, MessagesStorage messagesStorage, boolean[] zArr) {
        this.f20148a = i10;
        this.f20149b = messagesStorage;
        this.f20150c = j10;
        this.d = zArr;
        this.e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f20148a) {
            case 0:
                this.f20149b.lambda$checkMessageByRandomId$153(this.f20150c, this.d, this.e);
                return;
            case 1:
                this.f20149b.lambda$isMigratedChat$141(this.f20150c, this.d, this.e);
                return;
            default:
                this.f20149b.lambda$hasInviteMeMessage$143(this.f20150c, this.d, this.e);
                return;
        }
    }
}
