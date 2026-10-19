package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class pi implements Runnable {
    public final int f19289a;
    public final SendMessagesHelper f19290b;
    public final TL_update.TL_updateNewMessage f19291c;

    public pi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewMessage tL_updateNewMessage, int i10) {
        this.f19289a = i10;
        this.f19290b = sendMessagesHelper;
        this.f19291c = tL_updateNewMessage;
    }

    @Override
    public final void run() {
        switch (this.f19289a) {
            case 0:
                this.f19290b.lambda$performSendMessageRequest$94(this.f19291c);
                return;
            case 1:
                this.f19290b.lambda$performSendMessageRequestMulti$69(this.f19291c);
                return;
            default:
                this.f19290b.lambda$completeSendingGramTransfer$5(this.f19291c);
                return;
        }
    }
}
