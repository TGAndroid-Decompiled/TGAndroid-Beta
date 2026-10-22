package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class ti implements Runnable {
    public final int f19623a;
    public final SendMessagesHelper f19624b;
    public final TL_update.TL_updateNewMessage f19625c;

    public ti(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewMessage tL_updateNewMessage, int i10) {
        this.f19623a = i10;
        this.f19624b = sendMessagesHelper;
        this.f19625c = tL_updateNewMessage;
    }

    @Override
    public final void run() {
        switch (this.f19623a) {
            case 0:
                this.f19624b.lambda$performSendMessageRequest$94(this.f19625c);
                return;
            case 1:
                this.f19624b.lambda$performSendMessageRequestMulti$69(this.f19625c);
                return;
            default:
                this.f19624b.lambda$completeSendingGramTransfer$5(this.f19625c);
                return;
        }
    }
}
