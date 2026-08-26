package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class SendMessagesHelper$$ExternalSyntheticLambda36 implements Runnable {
    public final int $r8$classId;
    public final SendMessagesHelper f$0;
    public final TLObject f$1;
    public final TLRPC.InputMedia f$2;
    public final SendMessagesHelper.DelayedMessage f$3;

    public SendMessagesHelper$$ExternalSyntheticLambda36(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i) {
        this.$r8$classId = i;
        this.f$0 = sendMessagesHelper;
        this.f$1 = tLObject;
        this.f$2 = inputMedia;
        this.f$3 = delayedMessage;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$uploadMultiMedia$59(this.f$1, this.f$2, this.f$3);
                break;
            default:
                this.f$0.lambda$performSendDelayedMessage$51(this.f$1, this.f$2, this.f$3);
                break;
        }
    }
}
