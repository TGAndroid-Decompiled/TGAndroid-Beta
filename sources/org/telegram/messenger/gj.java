package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class gj implements Runnable {
    public final int f15299a;
    public final SendMessagesHelper f15300b;
    public final TL_update.TL_updateNewMessage f15301c;

    public gj(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewMessage tL_updateNewMessage, int i10) {
        this.f15299a = i10;
        this.f15300b = sendMessagesHelper;
        this.f15301c = tL_updateNewMessage;
    }

    @Override
    public final void run() {
        switch (this.f15299a) {
            case 0:
                this.f15300b.lambda$performSendMessageRequest$91(this.f15301c);
                return;
            default:
                this.f15300b.lambda$performSendMessageRequestMulti$66(this.f15301c);
                return;
        }
    }
}
