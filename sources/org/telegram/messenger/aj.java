package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class aj implements Runnable {
    public final int f15878a;
    public final SendMessagesHelper f15879b;
    public final TL_update.TL_updateNewChannelMessage f15880c;

    public aj(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, int i10) {
        this.f15878a = i10;
        this.f15879b = sendMessagesHelper;
        this.f15880c = tL_updateNewChannelMessage;
    }

    @Override
    public final void run() {
        switch (this.f15878a) {
            case 0:
                this.f15879b.lambda$performSendMessageRequest$92(this.f15880c);
                return;
            default:
                this.f15879b.lambda$performSendMessageRequestMulti$67(this.f15880c);
                return;
        }
    }
}
