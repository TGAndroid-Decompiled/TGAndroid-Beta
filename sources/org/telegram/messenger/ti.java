package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class ti implements Runnable {
    public final int f19690a;
    public final SendMessagesHelper f19691b;
    public final TL_update.TL_updateNewMessage f19692c;

    public ti(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewMessage tL_updateNewMessage, int i10) {
        this.f19690a = i10;
        this.f19691b = sendMessagesHelper;
        this.f19692c = tL_updateNewMessage;
    }

    @Override
    public final void run() {
        switch (this.f19690a) {
            case 0:
                this.f19691b.lambda$performSendMessageRequest$94(this.f19692c);
                return;
            case 1:
                this.f19691b.lambda$performSendMessageRequestMulti$69(this.f19692c);
                return;
            default:
                this.f19691b.lambda$completeSendingGramTransfer$5(this.f19692c);
                return;
        }
    }
}
