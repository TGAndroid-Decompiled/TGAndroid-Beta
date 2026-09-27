package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class xi implements Runnable {
    public final int f18136a;
    public final SendMessagesHelper f18137b;
    public final TL_update.TL_updateNewMessage f18138c;

    public xi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewMessage tL_updateNewMessage, int i10) {
        this.f18136a = i10;
        this.f18137b = sendMessagesHelper;
        this.f18138c = tL_updateNewMessage;
    }

    @Override
    public final void run() {
        switch (this.f18136a) {
            case 0:
                this.f18137b.lambda$performSendMessageRequest$91(this.f18138c);
                return;
            default:
                this.f18137b.lambda$performSendMessageRequestMulti$66(this.f18138c);
                return;
        }
    }
}
