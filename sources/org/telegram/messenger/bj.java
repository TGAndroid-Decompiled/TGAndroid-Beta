package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class bj implements Runnable {
    public final int f16873a;
    public final SendMessagesHelper f16874b;
    public final TL_update.TL_updateNewChannelMessage f16875c;

    public bj(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, int i10) {
        this.f16873a = i10;
        this.f16874b = sendMessagesHelper;
        this.f16875c = tL_updateNewChannelMessage;
    }

    @Override
    public final void run() {
        switch (this.f16873a) {
            case 0:
                this.f16874b.lambda$performSendMessageRequest$92(this.f16875c);
                return;
            default:
                this.f16874b.lambda$performSendMessageRequestMulti$67(this.f16875c);
                return;
        }
    }
}
