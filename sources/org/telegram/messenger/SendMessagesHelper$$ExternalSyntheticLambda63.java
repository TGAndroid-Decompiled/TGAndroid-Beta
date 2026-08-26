package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class SendMessagesHelper$$ExternalSyntheticLambda63 implements RequestDelegate {
    public final int $r8$classId;
    public final SendMessagesHelper f$0;
    public final TLRPC.InputMedia f$1;
    public final SendMessagesHelper.DelayedMessage f$2;

    public SendMessagesHelper$$ExternalSyntheticLambda63(SendMessagesHelper sendMessagesHelper, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i) {
        this.$r8$classId = i;
        this.f$0 = sendMessagesHelper;
        this.f$1 = inputMedia;
        this.f$2 = delayedMessage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$uploadMultiMedia$60(this.f$1, this.f$2, tLObject, tL_error);
                break;
            default:
                this.f$0.lambda$performSendDelayedMessage$52(this.f$1, this.f$2, tLObject, tL_error);
                break;
        }
    }
}
