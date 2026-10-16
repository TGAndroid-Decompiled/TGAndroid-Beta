package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class wi implements Runnable {
    public final int f18643a;
    public final SendMessagesHelper f18644b;
    public final TL_update.TL_updateNewMessage f18645c;

    public wi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewMessage tL_updateNewMessage, int i10) {
        this.f18643a = i10;
        this.f18644b = sendMessagesHelper;
        this.f18645c = tL_updateNewMessage;
    }

    @Override
    public final void run() {
        switch (this.f18643a) {
            case 0:
                this.f18644b.lambda$performSendMessageRequest$94(this.f18645c);
                return;
            case 1:
                this.f18644b.lambda$performSendMessageRequestMulti$69(this.f18645c);
                return;
            default:
                this.f18644b.lambda$completeSendingGramTransfer$5(this.f18645c);
                return;
        }
    }
}
