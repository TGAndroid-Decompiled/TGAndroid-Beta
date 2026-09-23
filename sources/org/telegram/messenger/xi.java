package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class xi implements Runnable {
    public final int f17881a;
    public final SendMessagesHelper f17882b;
    public final TL_update.TL_updateNewMessage f17883c;

    public xi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewMessage tL_updateNewMessage, int i10) {
        this.f17881a = i10;
        this.f17882b = sendMessagesHelper;
        this.f17883c = tL_updateNewMessage;
    }

    @Override
    public final void run() {
        switch (this.f17881a) {
            case 0:
                this.f17882b.lambda$performSendMessageRequest$91(this.f17883c);
                return;
            default:
                this.f17882b.lambda$performSendMessageRequestMulti$66(this.f17883c);
                return;
        }
    }
}
