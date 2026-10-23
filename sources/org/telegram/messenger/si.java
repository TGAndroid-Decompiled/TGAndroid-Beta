package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class si implements Runnable {
    public final int f19615a;
    public final SendMessagesHelper f19616b;
    public final TL_update.TL_updateNewMessage f19617c;

    public si(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewMessage tL_updateNewMessage, int i10) {
        this.f19615a = i10;
        this.f19616b = sendMessagesHelper;
        this.f19617c = tL_updateNewMessage;
    }

    @Override
    public final void run() {
        switch (this.f19615a) {
            case 0:
                this.f19616b.lambda$performSendMessageRequest$94(this.f19617c);
                return;
            case 1:
                this.f19616b.lambda$performSendMessageRequestMulti$69(this.f19617c);
                return;
            default:
                this.f19616b.lambda$completeSendingGramTransfer$5(this.f19617c);
                return;
        }
    }
}
