package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class qi implements Runnable {
    public final int f19373a;
    public final SendMessagesHelper f19374b;
    public final TL_update.TL_updateNewMessage f19375c;

    public qi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewMessage tL_updateNewMessage, int i10) {
        this.f19373a = i10;
        this.f19374b = sendMessagesHelper;
        this.f19375c = tL_updateNewMessage;
    }

    @Override
    public final void run() {
        switch (this.f19373a) {
            case 0:
                this.f19374b.lambda$performSendMessageRequest$94(this.f19375c);
                return;
            case 1:
                this.f19374b.lambda$performSendMessageRequestMulti$69(this.f19375c);
                return;
            default:
                this.f19374b.lambda$completeSendingGramTransfer$5(this.f19375c);
                return;
        }
    }
}
