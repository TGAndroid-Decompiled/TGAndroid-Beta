package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class xf implements Runnable {
    public final int f18725a;
    public final MessagesStorage f18726b;
    public final long f18727c;
    public final boolean[] d;
    public final CountDownLatch e;

    public xf(int i10, long j10, CountDownLatch countDownLatch, MessagesStorage messagesStorage, boolean[] zArr) {
        this.f18725a = i10;
        this.f18726b = messagesStorage;
        this.f18727c = j10;
        this.d = zArr;
        this.e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f18725a) {
            case 0:
                this.f18726b.lambda$checkMessageByRandomId$153(this.f18727c, this.d, this.e);
                return;
            case 1:
                this.f18726b.lambda$isMigratedChat$141(this.f18727c, this.d, this.e);
                return;
            default:
                this.f18726b.lambda$hasInviteMeMessage$143(this.f18727c, this.d, this.e);
                return;
        }
    }
}
