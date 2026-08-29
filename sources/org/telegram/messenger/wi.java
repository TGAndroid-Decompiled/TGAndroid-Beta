package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class wi implements Runnable {
    public final int f22105a;
    public final SendMessagesHelper f22106b;
    public final TL_update.TL_updateNewMessage f22107c;

    public wi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewMessage tL_updateNewMessage, int i10) {
        this.f22105a = i10;
        this.f22106b = sendMessagesHelper;
        this.f22107c = tL_updateNewMessage;
    }

    @Override
    public final void run() {
        switch (this.f22105a) {
            case 0:
                this.f22106b.lambda$performSendMessageRequest$91(this.f22107c);
                return;
            default:
                this.f22106b.lambda$performSendMessageRequestMulti$66(this.f22107c);
                return;
        }
    }
}
