package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class qi implements Runnable {
    public final int f19366a;
    public final SendMessagesHelper f19367b;
    public final TL_update.TL_updateNewMessage f19368c;

    public qi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewMessage tL_updateNewMessage, int i10) {
        this.f19366a = i10;
        this.f19367b = sendMessagesHelper;
        this.f19368c = tL_updateNewMessage;
    }

    @Override
    public final void run() {
        switch (this.f19366a) {
            case 0:
                this.f19367b.lambda$performSendMessageRequest$94(this.f19368c);
                return;
            case 1:
                this.f19367b.lambda$performSendMessageRequestMulti$69(this.f19368c);
                return;
            default:
                this.f19367b.lambda$completeSendingGramTransfer$5(this.f19368c);
                return;
        }
    }
}
