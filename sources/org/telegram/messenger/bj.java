package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class bj implements Runnable {
    public final int f18292a;
    public final SendMessagesHelper f18293b;
    public final TL_update.TL_updateNewMessage f18294c;

    public bj(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewMessage tL_updateNewMessage, int i10) {
        this.f18292a = i10;
        this.f18293b = sendMessagesHelper;
        this.f18294c = tL_updateNewMessage;
    }

    @Override
    public final void run() {
        switch (this.f18292a) {
            case 0:
                this.f18293b.lambda$performSendMessageRequest$91(this.f18294c);
                return;
            default:
                this.f18293b.lambda$performSendMessageRequestMulti$66(this.f18294c);
                return;
        }
    }
}
