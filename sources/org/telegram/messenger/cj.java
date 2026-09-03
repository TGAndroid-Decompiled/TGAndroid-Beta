package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class cj implements Runnable {
    public final int f18434a;
    public final SendMessagesHelper f18435b;
    public final TL_update.TL_updateNewChannelMessage f18436c;

    public cj(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, int i10) {
        this.f18434a = i10;
        this.f18435b = sendMessagesHelper;
        this.f18436c = tL_updateNewChannelMessage;
    }

    @Override
    public final void run() {
        switch (this.f18434a) {
            case 0:
                this.f18435b.lambda$performSendMessageRequest$92(this.f18436c);
                return;
            default:
                this.f18435b.lambda$performSendMessageRequestMulti$67(this.f18436c);
                return;
        }
    }
}
