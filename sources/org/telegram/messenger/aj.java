package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class aj implements Runnable {
    public final int f16778a;
    public final SendMessagesHelper f16779b;
    public final TL_update.TL_updateNewMessage f16780c;

    public aj(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewMessage tL_updateNewMessage, int i10) {
        this.f16778a = i10;
        this.f16779b = sendMessagesHelper;
        this.f16780c = tL_updateNewMessage;
    }

    @Override
    public final void run() {
        switch (this.f16778a) {
            case 0:
                this.f16779b.lambda$performSendMessageRequest$91(this.f16780c);
                return;
            default:
                this.f16779b.lambda$performSendMessageRequestMulti$66(this.f16780c);
                return;
        }
    }
}
