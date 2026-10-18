package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class pi implements Runnable {
    public final int f19292a;
    public final SendMessagesHelper f19293b;
    public final TL_update.TL_updateNewMessage f19294c;

    public pi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewMessage tL_updateNewMessage, int i10) {
        this.f19292a = i10;
        this.f19293b = sendMessagesHelper;
        this.f19294c = tL_updateNewMessage;
    }

    @Override
    public final void run() {
        switch (this.f19292a) {
            case 0:
                this.f19293b.lambda$performSendMessageRequest$94(this.f19294c);
                return;
            case 1:
                this.f19293b.lambda$performSendMessageRequestMulti$69(this.f19294c);
                return;
            default:
                this.f19293b.lambda$completeSendingGramTransfer$5(this.f19294c);
                return;
        }
    }
}
