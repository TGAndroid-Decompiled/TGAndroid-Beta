package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class xi implements Runnable {
    public final int f18147a;
    public final SendMessagesHelper f18148b;
    public final TL_update.TL_updateNewMessage f18149c;

    public xi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewMessage tL_updateNewMessage, int i10) {
        this.f18147a = i10;
        this.f18148b = sendMessagesHelper;
        this.f18149c = tL_updateNewMessage;
    }

    @Override
    public final void run() {
        switch (this.f18147a) {
            case 0:
                this.f18148b.lambda$performSendMessageRequest$91(this.f18149c);
                return;
            default:
                this.f18148b.lambda$performSendMessageRequestMulti$66(this.f18149c);
                return;
        }
    }
}
