package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class xi implements Runnable {
    public final int f22186a;
    public final SendMessagesHelper f22187b;
    public final TL_update.TL_updateNewChannelMessage f22188c;

    public xi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, int i10) {
        this.f22186a = i10;
        this.f22187b = sendMessagesHelper;
        this.f22188c = tL_updateNewChannelMessage;
    }

    @Override
    public final void run() {
        switch (this.f22186a) {
            case 0:
                this.f22187b.lambda$performSendMessageRequest$92(this.f22188c);
                return;
            default:
                this.f22187b.lambda$performSendMessageRequestMulti$67(this.f22188c);
                return;
        }
    }
}
