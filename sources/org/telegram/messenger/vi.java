package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class vi implements Runnable {
    public final int f19443a;
    public final SendMessagesHelper f19444b;
    public final TL_update.TL_updateNewMessage f19445c;

    public vi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewMessage tL_updateNewMessage, int i10) {
        this.f19443a = i10;
        this.f19444b = sendMessagesHelper;
        this.f19445c = tL_updateNewMessage;
    }

    @Override
    public final void run() {
        switch (this.f19443a) {
            case 0:
                this.f19444b.lambda$performSendMessageRequest$94(this.f19445c);
                return;
            case 1:
                this.f19444b.lambda$performSendMessageRequestMulti$69(this.f19445c);
                return;
            default:
                this.f19444b.lambda$completeSendingGramTransfer$5(this.f19445c);
                return;
        }
    }
}
