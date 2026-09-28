package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class xi implements Runnable {
    public final int f18145a;
    public final SendMessagesHelper f18146b;
    public final TL_update.TL_updateNewMessage f18147c;

    public xi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewMessage tL_updateNewMessage, int i10) {
        this.f18145a = i10;
        this.f18146b = sendMessagesHelper;
        this.f18147c = tL_updateNewMessage;
    }

    @Override
    public final void run() {
        switch (this.f18145a) {
            case 0:
                this.f18146b.lambda$performSendMessageRequest$91(this.f18147c);
                return;
            default:
                this.f18146b.lambda$performSendMessageRequestMulti$66(this.f18147c);
                return;
        }
    }
}
