package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class si implements Runnable {
    public final int f19547a;
    public final SendMessagesHelper f19548b;
    public final TL_update.TL_updateNewMessage f19549c;

    public si(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewMessage tL_updateNewMessage, int i10) {
        this.f19547a = i10;
        this.f19548b = sendMessagesHelper;
        this.f19549c = tL_updateNewMessage;
    }

    @Override
    public final void run() {
        switch (this.f19547a) {
            case 0:
                this.f19548b.lambda$performSendMessageRequest$94(this.f19549c);
                return;
            case 1:
                this.f19548b.lambda$performSendMessageRequestMulti$69(this.f19549c);
                return;
            default:
                this.f19548b.lambda$completeSendingGramTransfer$5(this.f19549c);
                return;
        }
    }
}
