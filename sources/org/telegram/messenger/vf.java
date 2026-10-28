package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class vf implements Runnable {
    public final int f21520a;
    public final MessagesStorage f21521b;
    public final long f21522c;
    public final boolean[] d;
    public final CountDownLatch e;

    public vf(int i10, long j10, CountDownLatch countDownLatch, MessagesStorage messagesStorage, boolean[] zArr) {
        this.f21520a = i10;
        this.f21521b = messagesStorage;
        this.f21522c = j10;
        this.d = zArr;
        this.e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f21520a) {
            case 0:
                this.f21521b.lambda$checkMessageByRandomId$157(this.f21522c, this.d, this.e);
                return;
            case 1:
                this.f21521b.lambda$hasInviteMeMessage$147(this.f21522c, this.d, this.e);
                return;
            default:
                this.f21521b.lambda$isMigratedChat$145(this.f21522c, this.d, this.e);
                return;
        }
    }
}
