package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

public final class MessagesStorage$$ExternalSyntheticLambda107 implements Runnable {
    public final int $r8$classId;
    public final MessagesStorage f$0;
    public final TLRPC.Message f$1;
    public final long f$2;

    public MessagesStorage$$ExternalSyntheticLambda107(int i, long j, MessagesStorage messagesStorage, TLRPC.Message message) {
        this.$r8$classId = i;
        this.f$0 = messagesStorage;
        this.f$1 = message;
        this.f$2 = j;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$updateMessageCustomParams$110(this.f$1, this.f$2);
                break;
            default:
                this.f$0.lambda$markMessageAsSendErrorWithParams$210(this.f$1, this.f$2);
                break;
        }
    }
}
