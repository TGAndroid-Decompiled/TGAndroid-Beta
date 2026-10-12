package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class xi implements Runnable {
    public final int f19029a;
    public final SendMessagesHelper f19030b;
    public final TL_update.TL_updateNewMessage f19031c;

    public xi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewMessage tL_updateNewMessage, int i10) {
        this.f19029a = i10;
        this.f19030b = sendMessagesHelper;
        this.f19031c = tL_updateNewMessage;
    }

    @Override
    public final void run() {
        switch (this.f19029a) {
            case 0:
                this.f19030b.lambda$performSendMessageRequest$94(this.f19031c);
                return;
            case 1:
                this.f19030b.lambda$performSendMessageRequestMulti$69(this.f19031c);
                return;
            default:
                this.f19030b.lambda$completeSendingGramTransfer$5(this.f19031c);
                return;
        }
    }
}
