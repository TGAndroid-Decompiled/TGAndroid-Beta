package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class cj implements Runnable {
    public final int f18432a;
    public final SendMessagesHelper f18433b;
    public final TL_update.TL_updateNewChannelMessage f18434c;

    public cj(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, int i10) {
        this.f18432a = i10;
        this.f18433b = sendMessagesHelper;
        this.f18434c = tL_updateNewChannelMessage;
    }

    @Override
    public final void run() {
        switch (this.f18432a) {
            case 0:
                this.f18433b.lambda$performSendMessageRequest$92(this.f18434c);
                return;
            default:
                this.f18433b.lambda$performSendMessageRequestMulti$67(this.f18434c);
                return;
        }
    }
}
