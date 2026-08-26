package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

public final class SendMessagesHelper$$ExternalSyntheticLambda83 implements Runnable {
    public final int $r8$classId;
    public final SendMessagesHelper f$0;
    public final TLRPC.Message f$1;
    public final int f$2;

    public SendMessagesHelper$$ExternalSyntheticLambda83(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = sendMessagesHelper;
        this.f$1 = message;
        this.f$2 = i;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$sendMessage$15(this.f$1, this.f$2);
                break;
            default:
                this.f$0.lambda$performSendMessageRequest$102(this.f$1, this.f$2);
                break;
        }
    }
}
