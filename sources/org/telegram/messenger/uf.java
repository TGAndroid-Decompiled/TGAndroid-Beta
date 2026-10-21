package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class uf implements Runnable {
    public final int f19670a;
    public final MessagesStorage f19671b;
    public final long f19672c;
    public final boolean[] d;
    public final CountDownLatch e;

    public uf(int i10, long j10, CountDownLatch countDownLatch, MessagesStorage messagesStorage, boolean[] zArr) {
        this.f19670a = i10;
        this.f19671b = messagesStorage;
        this.f19672c = j10;
        this.d = zArr;
        this.e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f19670a) {
            case 0:
                this.f19671b.lambda$checkMessageByRandomId$153(this.f19672c, this.d, this.e);
                return;
            case 1:
                this.f19671b.lambda$isMigratedChat$141(this.f19672c, this.d, this.e);
                return;
            default:
                this.f19671b.lambda$hasInviteMeMessage$143(this.f19672c, this.d, this.e);
                return;
        }
    }
}
