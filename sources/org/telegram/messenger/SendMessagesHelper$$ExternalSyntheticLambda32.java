package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;

public final class SendMessagesHelper$$ExternalSyntheticLambda32 implements Runnable {
    public final int $r8$classId;
    public final SendMessagesHelper f$0;
    public final TL_update.TL_updateNewChannelMessage f$1;

    public SendMessagesHelper$$ExternalSyntheticLambda32(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, int i) {
        this.$r8$classId = i;
        this.f$0 = sendMessagesHelper;
        this.f$1 = tL_updateNewChannelMessage;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$performSendMessageRequestMulti$67(this.f$1);
                break;
            default:
                this.f$0.lambda$performSendMessageRequest$92(this.f$1);
                break;
        }
    }
}
