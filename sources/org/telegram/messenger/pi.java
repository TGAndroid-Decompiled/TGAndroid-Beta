package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class pi implements Runnable {
    public final int f21250a;
    public final SendMessagesHelper f21251b;
    public final TL_update.TL_updateNewMessage f21252c;

    public pi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewMessage tL_updateNewMessage, int i9) {
        this.f21250a = i9;
        this.f21251b = sendMessagesHelper;
        this.f21252c = tL_updateNewMessage;
    }

    @Override
    public final void run() {
        switch (this.f21250a) {
            case 0:
                this.f21251b.lambda$performSendMessageRequest$91(this.f21252c);
                return;
            default:
                this.f21251b.lambda$performSendMessageRequestMulti$66(this.f21252c);
                return;
        }
    }
}
