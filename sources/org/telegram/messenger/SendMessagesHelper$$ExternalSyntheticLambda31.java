package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;

public final class SendMessagesHelper$$ExternalSyntheticLambda31 implements Runnable {
    public final int $r8$classId;
    public final SendMessagesHelper f$0;
    public final TL_update.TL_updateNewMessage f$1;

    public SendMessagesHelper$$ExternalSyntheticLambda31(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewMessage tL_updateNewMessage, int i) {
        this.$r8$classId = i;
        this.f$0 = sendMessagesHelper;
        this.f$1 = tL_updateNewMessage;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$performSendMessageRequestMulti$66(this.f$1);
                break;
            default:
                this.f$0.lambda$performSendMessageRequest$91(this.f$1);
                break;
        }
    }
}
