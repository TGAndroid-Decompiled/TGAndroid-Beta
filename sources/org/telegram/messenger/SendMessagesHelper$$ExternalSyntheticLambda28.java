package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

public final class SendMessagesHelper$$ExternalSyntheticLambda28 implements Runnable {
    public final int $r8$classId;
    public final SendMessagesHelper f$0;
    public final TLRPC.Message f$1;
    public final boolean f$2;

    public SendMessagesHelper$$ExternalSyntheticLambda28(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = sendMessagesHelper;
        this.f$1 = message;
        this.f$2 = z;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$performSendMessageRequest$84(this.f$1, this.f$2);
                break;
            case 1:
                this.f$0.lambda$putToSendingMessages$61(this.f$1, this.f$2);
                break;
            default:
                this.f$0.lambda$performSendMessageRequest$87(this.f$1, this.f$2);
                break;
        }
    }
}
