package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class bj implements Runnable {
    public final int f16859a;
    public final SendMessagesHelper f16860b;
    public final TL_update.TL_updateNewMessage f16861c;

    public bj(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewMessage tL_updateNewMessage, int i10) {
        this.f16859a = i10;
        this.f16860b = sendMessagesHelper;
        this.f16861c = tL_updateNewMessage;
    }

    @Override
    public final void run() {
        switch (this.f16859a) {
            case 0:
                this.f16860b.lambda$performSendMessageRequest$91(this.f16861c);
                return;
            default:
                this.f16860b.lambda$performSendMessageRequestMulti$66(this.f16861c);
                return;
        }
    }
}
