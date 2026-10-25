package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class uf implements Runnable {
    public final int f21438a;
    public final MessagesStorage f21439b;
    public final long f21440c;
    public final boolean[] d;
    public final CountDownLatch e;

    public uf(int i10, long j10, CountDownLatch countDownLatch, MessagesStorage messagesStorage, boolean[] zArr) {
        this.f21438a = i10;
        this.f21439b = messagesStorage;
        this.f21440c = j10;
        this.d = zArr;
        this.e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f21438a) {
            case 0:
                this.f21439b.lambda$checkMessageByRandomId$156(this.f21440c, this.d, this.e);
                return;
            case 1:
                this.f21439b.lambda$hasInviteMeMessage$146(this.f21440c, this.d, this.e);
                return;
            default:
                this.f21439b.lambda$isMigratedChat$144(this.f21440c, this.d, this.e);
                return;
        }
    }
}
