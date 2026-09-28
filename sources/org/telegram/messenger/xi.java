package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class xi implements Runnable {
    public final int f18146a;
    public final SendMessagesHelper f18147b;
    public final TL_update.TL_updateNewMessage f18148c;

    public xi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewMessage tL_updateNewMessage, int i10) {
        this.f18146a = i10;
        this.f18147b = sendMessagesHelper;
        this.f18148c = tL_updateNewMessage;
    }

    @Override
    public final void run() {
        switch (this.f18146a) {
            case 0:
                this.f18147b.lambda$performSendMessageRequest$91(this.f18148c);
                return;
            default:
                this.f18147b.lambda$performSendMessageRequestMulti$66(this.f18148c);
                return;
        }
    }
}
