package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class uf implements Runnable {
    public final int f19341a;
    public final MessagesStorage f19342b;
    public final long f19343c;
    public final boolean[] d;
    public final CountDownLatch f19344e;

    public uf(int i10, long j3, CountDownLatch countDownLatch, MessagesStorage messagesStorage, boolean[] zArr) {
        this.f19341a = i10;
        this.f19342b = messagesStorage;
        this.f19343c = j3;
        this.d = zArr;
        this.f19344e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f19341a) {
            case 0:
                this.f19342b.lambda$checkMessageByRandomId$153(this.f19343c, this.d, this.f19344e);
                return;
            case 1:
                this.f19342b.lambda$isMigratedChat$141(this.f19343c, this.d, this.f19344e);
                return;
            default:
                this.f19342b.lambda$hasInviteMeMessage$143(this.f19343c, this.d, this.f19344e);
                return;
        }
    }
}
