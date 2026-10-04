package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class xi implements Runnable {
    public final int f19825a;
    public final SendMessagesHelper f19826b;
    public final TL_update.TL_updateNewMessage f19827c;

    public xi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewMessage tL_updateNewMessage, int i10) {
        this.f19825a = i10;
        this.f19826b = sendMessagesHelper;
        this.f19827c = tL_updateNewMessage;
    }

    @Override
    public final void run() {
        switch (this.f19825a) {
            case 0:
                this.f19826b.lambda$performSendMessageRequest$91(this.f19827c);
                return;
            default:
                this.f19826b.lambda$performSendMessageRequestMulti$66(this.f19827c);
                return;
        }
    }
}
