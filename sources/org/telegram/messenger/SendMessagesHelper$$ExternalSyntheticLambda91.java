package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

public final class SendMessagesHelper$$ExternalSyntheticLambda91 implements Runnable {
    public final int $r8$classId;
    public final SendMessagesHelper f$0;
    public final TLRPC.Updates f$1;
    public final TLRPC.Message f$2;
    public final boolean f$3;

    public SendMessagesHelper$$ExternalSyntheticLambda91(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, TLRPC.Message message, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = sendMessagesHelper;
        this.f$1 = updates;
        this.f$2 = message;
        this.f$3 = z;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$performSendMessageRequest$85(this.f$1, this.f$2, this.f$3);
                break;
            default:
                this.f$0.lambda$performSendMessageRequest$88(this.f$1, this.f$2, this.f$3);
                break;
        }
    }
}
