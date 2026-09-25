package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class xi implements Runnable {
    public final int f18142a;
    public final SendMessagesHelper f18143b;
    public final TL_update.TL_updateNewMessage f18144c;

    public xi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewMessage tL_updateNewMessage, int i10) {
        this.f18142a = i10;
        this.f18143b = sendMessagesHelper;
        this.f18144c = tL_updateNewMessage;
    }

    @Override
    public final void run() {
        switch (this.f18142a) {
            case 0:
                this.f18143b.lambda$performSendMessageRequest$91(this.f18144c);
                return;
            default:
                this.f18143b.lambda$performSendMessageRequestMulti$66(this.f18144c);
                return;
        }
    }
}
