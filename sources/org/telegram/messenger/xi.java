package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class xi implements Runnable {
    public final int f19824a;
    public final SendMessagesHelper f19825b;
    public final TL_update.TL_updateNewMessage f19826c;

    public xi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewMessage tL_updateNewMessage, int i10) {
        this.f19824a = i10;
        this.f19825b = sendMessagesHelper;
        this.f19826c = tL_updateNewMessage;
    }

    @Override
    public final void run() {
        switch (this.f19824a) {
            case 0:
                this.f19825b.lambda$performSendMessageRequest$91(this.f19826c);
                return;
            default:
                this.f19825b.lambda$performSendMessageRequestMulti$66(this.f19826c);
                return;
        }
    }
}
