package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class wi implements Runnable {
    public final int f21782a;
    public final SendMessagesHelper f21783b;
    public final TL_update.TL_updateNewMessage f21784c;

    public wi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewMessage tL_updateNewMessage, int i10) {
        this.f21782a = i10;
        this.f21783b = sendMessagesHelper;
        this.f21784c = tL_updateNewMessage;
    }

    @Override
    public final void run() {
        switch (this.f21782a) {
            case 0:
                this.f21783b.lambda$performSendMessageRequest$94(this.f21784c);
                return;
            case 1:
                this.f21783b.lambda$performSendMessageRequestMulti$69(this.f21784c);
                return;
            default:
                this.f21783b.lambda$completeSendingGramTransfer$5(this.f21784c);
                return;
        }
    }
}
