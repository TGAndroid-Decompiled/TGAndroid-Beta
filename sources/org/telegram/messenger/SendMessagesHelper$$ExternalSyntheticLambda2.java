package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;

public final class SendMessagesHelper$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final SendMessagesHelper f$0;
    public final TLRPC.TL_error f$1;
    public final BaseFragment f$2;
    public final TLRPC.TL_messages_editMessage f$3;

    public SendMessagesHelper$$ExternalSyntheticLambda2(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, BaseFragment baseFragment, TLRPC.TL_messages_editMessage tL_messages_editMessage, int i) {
        this.$r8$classId = i;
        this.f$0 = sendMessagesHelper;
        this.f$1 = tL_error;
        this.f$2 = baseFragment;
        this.f$3 = tL_messages_editMessage;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$editMessage$20(this.f$1, this.f$2, this.f$3);
                break;
            default:
                this.f$0.lambda$sendEditRichMessageRequest$25(this.f$1, this.f$2, this.f$3);
                break;
        }
    }
}
