package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class ri implements Runnable {
    public final int f19462a;
    public final SendMessagesHelper f19463b;
    public final TL_update.TL_updateNewMessage f19464c;

    public ri(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewMessage tL_updateNewMessage, int i10) {
        this.f19462a = i10;
        this.f19463b = sendMessagesHelper;
        this.f19464c = tL_updateNewMessage;
    }

    @Override
    public final void run() {
        switch (this.f19462a) {
            case 0:
                this.f19463b.lambda$performSendMessageRequest$94(this.f19464c);
                return;
            case 1:
                this.f19463b.lambda$performSendMessageRequestMulti$69(this.f19464c);
                return;
            default:
                this.f19463b.lambda$completeSendingGramTransfer$5(this.f19464c);
                return;
        }
    }
}
