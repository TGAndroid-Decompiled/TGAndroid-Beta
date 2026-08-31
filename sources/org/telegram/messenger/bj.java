package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class bj implements Runnable {
    public final int f18290a;
    public final SendMessagesHelper f18291b;
    public final TL_update.TL_updateNewMessage f18292c;

    public bj(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewMessage tL_updateNewMessage, int i10) {
        this.f18290a = i10;
        this.f18291b = sendMessagesHelper;
        this.f18292c = tL_updateNewMessage;
    }

    @Override
    public final void run() {
        switch (this.f18290a) {
            case 0:
                this.f18291b.lambda$performSendMessageRequest$91(this.f18292c);
                return;
            default:
                this.f18291b.lambda$performSendMessageRequestMulti$66(this.f18292c);
                return;
        }
    }
}
