package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class xi implements Runnable {
    public final int f18127a;
    public final SendMessagesHelper f18128b;
    public final TL_update.TL_updateNewMessage f18129c;

    public xi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewMessage tL_updateNewMessage, int i10) {
        this.f18127a = i10;
        this.f18128b = sendMessagesHelper;
        this.f18129c = tL_updateNewMessage;
    }

    @Override
    public final void run() {
        switch (this.f18127a) {
            case 0:
                this.f18128b.lambda$performSendMessageRequest$91(this.f18129c);
                return;
            default:
                this.f18128b.lambda$performSendMessageRequestMulti$66(this.f18129c);
                return;
        }
    }
}
