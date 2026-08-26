package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

public final class MessagesController$$ExternalSyntheticLambda235 implements Runnable {
    public final int $r8$classId;
    public final MessagesController f$0;
    public final TLRPC.TL_error f$1;
    public final long f$2;

    public MessagesController$$ExternalSyntheticLambda235(MessagesController messagesController, TLRPC.TL_error tL_error, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = messagesController;
        this.f$1 = tL_error;
        this.f$2 = j;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$loadFullChat$68(this.f$1, this.f$2);
                break;
            default:
                this.f$0.lambda$getChannelDifference$348(this.f$1, this.f$2);
                break;
        }
    }
}
