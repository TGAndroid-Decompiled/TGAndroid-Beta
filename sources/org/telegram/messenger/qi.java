package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class qi implements Runnable {
    public final int f21340a;
    public final SendMessagesHelper f21341b;
    public final TL_update.TL_updateNewChannelMessage f21342c;

    public qi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, int i9) {
        this.f21340a = i9;
        this.f21341b = sendMessagesHelper;
        this.f21342c = tL_updateNewChannelMessage;
    }

    @Override
    public final void run() {
        switch (this.f21340a) {
            case 0:
                this.f21341b.lambda$performSendMessageRequest$92(this.f21342c);
                return;
            default:
                this.f21341b.lambda$performSendMessageRequestMulti$67(this.f21342c);
                return;
        }
    }
}
