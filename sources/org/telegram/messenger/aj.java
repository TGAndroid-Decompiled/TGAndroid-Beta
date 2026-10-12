package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class aj implements Runnable {
    public final int f17103a;
    public final SendMessagesHelper f17104b;
    public final TL_update.TL_updateNewChannelMessage f17105c;

    public aj(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, int i10) {
        this.f17103a = i10;
        this.f17104b = sendMessagesHelper;
        this.f17105c = tL_updateNewChannelMessage;
    }

    @Override
    public final void run() {
        switch (this.f17103a) {
            case 0:
                this.f17104b.lambda$performSendMessageRequest$95(this.f17105c);
                return;
            default:
                this.f17104b.lambda$performSendMessageRequestMulti$70(this.f17105c);
                return;
        }
    }
}
