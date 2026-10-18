package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class qi implements Runnable {
    public final int f19371a;
    public final SendMessagesHelper f19372b;
    public final TL_update.TL_updateNewChannelMessage f19373c;

    public qi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, int i10) {
        this.f19371a = i10;
        this.f19372b = sendMessagesHelper;
        this.f19373c = tL_updateNewChannelMessage;
    }

    @Override
    public final void run() {
        switch (this.f19371a) {
            case 0:
                this.f19372b.lambda$performSendMessageRequest$95(this.f19373c);
                return;
            default:
                this.f19372b.lambda$performSendMessageRequestMulti$70(this.f19373c);
                return;
        }
    }
}
