package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

public final class SendMessagesHelper$$ExternalSyntheticLambda35 implements Runnable {
    public final int $r8$classId;
    public final SendMessagesHelper f$0;
    public final TLRPC.Updates f$1;

    public SendMessagesHelper$$ExternalSyntheticLambda35(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, int i) {
        this.$r8$classId = i;
        this.f$0 = sendMessagesHelper;
        this.f$1 = updates;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$performSendMessageRequestMulti$72(this.f$1);
                break;
            default:
                this.f$0.lambda$performSendMessageRequest$94(this.f$1);
                break;
        }
    }
}
