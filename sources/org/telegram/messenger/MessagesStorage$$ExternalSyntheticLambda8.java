package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;

public final class MessagesStorage$$ExternalSyntheticLambda8 implements Runnable {
    public final int $r8$classId;
    public final MessagesStorage f$0;
    public final long f$1;
    public final boolean[] f$2;
    public final CountDownLatch f$3;

    public MessagesStorage$$ExternalSyntheticLambda8(int i, long j, CountDownLatch countDownLatch, MessagesStorage messagesStorage, boolean[] zArr) {
        this.$r8$classId = i;
        this.f$0 = messagesStorage;
        this.f$1 = j;
        this.f$2 = zArr;
        this.f$3 = countDownLatch;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$isMigratedChat$141(this.f$1, this.f$2, this.f$3);
                break;
            case 1:
                this.f$0.lambda$checkMessageByRandomId$153(this.f$1, this.f$2, this.f$3);
                break;
            default:
                this.f$0.lambda$hasInviteMeMessage$143(this.f$1, this.f$2, this.f$3);
                break;
        }
    }
}
