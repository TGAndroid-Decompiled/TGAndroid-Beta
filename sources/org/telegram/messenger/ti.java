package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;

public final class ti implements Runnable {

    public final int f21647a;

    public final SendMessagesHelper f21648b;

    public final TL_update.TL_updateNewMessage f21649c;

    public ti(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewMessage tL_updateNewMessage, int i10) {
        this.f21647a = i10;
        this.f21648b = sendMessagesHelper;
        this.f21649c = tL_updateNewMessage;
    }

    @Override
    public final void run() {
        switch (this.f21647a) {
            case 0:
                this.f21648b.lambda$performSendMessageRequest$91(this.f21649c);
                break;
            default:
                this.f21648b.lambda$performSendMessageRequestMulti$66(this.f21649c);
                break;
        }
    }
}
