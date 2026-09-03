package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class cj implements Runnable {
    public final int f16988a;
    public final SendMessagesHelper f16989b;
    public final TL_update.TL_updateNewChannelMessage f16990c;

    public cj(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, int i10) {
        this.f16988a = i10;
        this.f16989b = sendMessagesHelper;
        this.f16990c = tL_updateNewChannelMessage;
    }

    @Override
    public final void run() {
        switch (this.f16988a) {
            case 0:
                this.f16989b.lambda$performSendMessageRequest$92(this.f16990c);
                return;
            default:
                this.f16989b.lambda$performSendMessageRequestMulti$67(this.f16990c);
                return;
        }
    }
}
