package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class aj implements Runnable {
    public final int f17102a;
    public final SendMessagesHelper f17103b;
    public final TL_update.TL_updateNewChannelMessage f17104c;

    public aj(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, int i10) {
        this.f17102a = i10;
        this.f17103b = sendMessagesHelper;
        this.f17104c = tL_updateNewChannelMessage;
    }

    @Override
    public final void run() {
        switch (this.f17102a) {
            case 0:
                this.f17103b.lambda$performSendMessageRequest$95(this.f17104c);
                return;
            default:
                this.f17103b.lambda$performSendMessageRequestMulti$70(this.f17104c);
                return;
        }
    }
}
