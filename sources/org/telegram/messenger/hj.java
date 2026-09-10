package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class hj implements Runnable {
    public final int f15393a;
    public final SendMessagesHelper f15394b;
    public final TL_update.TL_updateNewChannelMessage f15395c;

    public hj(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, int i10) {
        this.f15393a = i10;
        this.f15394b = sendMessagesHelper;
        this.f15395c = tL_updateNewChannelMessage;
    }

    @Override
    public final void run() {
        switch (this.f15393a) {
            case 0:
                this.f15394b.lambda$performSendMessageRequest$92(this.f15395c);
                return;
            default:
                this.f15394b.lambda$performSendMessageRequestMulti$67(this.f15395c);
                return;
        }
    }
}
