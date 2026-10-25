package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class vi implements Runnable {
    public final int f21544a;
    public final SendMessagesHelper f21545b;
    public final TL_update.TL_updateNewMessage f21546c;

    public vi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewMessage tL_updateNewMessage, int i10) {
        this.f21544a = i10;
        this.f21545b = sendMessagesHelper;
        this.f21546c = tL_updateNewMessage;
    }

    @Override
    public final void run() {
        switch (this.f21544a) {
            case 0:
                this.f21545b.lambda$performSendMessageRequest$94(this.f21546c);
                return;
            case 1:
                this.f21545b.lambda$performSendMessageRequestMulti$69(this.f21546c);
                return;
            default:
                this.f21545b.lambda$completeSendingGramTransfer$5(this.f21546c);
                return;
        }
    }
}
