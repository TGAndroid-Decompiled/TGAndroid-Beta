package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class vi implements Runnable {
    public final int f19447a;
    public final SendMessagesHelper f19448b;
    public final TL_update.TL_updateNewMessage f19449c;

    public vi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewMessage tL_updateNewMessage, int i10) {
        this.f19447a = i10;
        this.f19448b = sendMessagesHelper;
        this.f19449c = tL_updateNewMessage;
    }

    @Override
    public final void run() {
        switch (this.f19447a) {
            case 0:
                this.f19448b.lambda$performSendMessageRequest$94(this.f19449c);
                return;
            case 1:
                this.f19448b.lambda$performSendMessageRequestMulti$69(this.f19449c);
                return;
            default:
                this.f19448b.lambda$completeSendingGramTransfer$5(this.f19449c);
                return;
        }
    }
}
