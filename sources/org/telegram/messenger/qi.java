package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class qi implements Runnable {
    public final int f19370a;
    public final SendMessagesHelper f19371b;
    public final TL_update.TL_updateNewMessage f19372c;

    public qi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewMessage tL_updateNewMessage, int i10) {
        this.f19370a = i10;
        this.f19371b = sendMessagesHelper;
        this.f19372c = tL_updateNewMessage;
    }

    @Override
    public final void run() {
        switch (this.f19370a) {
            case 0:
                this.f19371b.lambda$performSendMessageRequest$94(this.f19372c);
                return;
            case 1:
                this.f19371b.lambda$performSendMessageRequestMulti$69(this.f19372c);
                return;
            default:
                this.f19371b.lambda$completeSendingGramTransfer$5(this.f19372c);
                return;
        }
    }
}
