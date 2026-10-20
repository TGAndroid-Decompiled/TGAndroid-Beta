package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class ri implements Runnable {
    public final int f19465a;
    public final SendMessagesHelper f19466b;
    public final TL_update.TL_updateNewMessage f19467c;

    public ri(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewMessage tL_updateNewMessage, int i10) {
        this.f19465a = i10;
        this.f19466b = sendMessagesHelper;
        this.f19467c = tL_updateNewMessage;
    }

    @Override
    public final void run() {
        switch (this.f19465a) {
            case 0:
                this.f19466b.lambda$performSendMessageRequest$94(this.f19467c);
                return;
            case 1:
                this.f19466b.lambda$performSendMessageRequestMulti$69(this.f19467c);
                return;
            default:
                this.f19466b.lambda$completeSendingGramTransfer$5(this.f19467c);
                return;
        }
    }
}
