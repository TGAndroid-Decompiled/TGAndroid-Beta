package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class aj implements Runnable {
    public final int f17206a;
    public final SendMessagesHelper f17207b;
    public final TL_update.TL_updateNewChannelMessage f17208c;
    public final long d;

    public aj(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, long j3, int i10) {
        this.f17206a = i10;
        this.f17207b = sendMessagesHelper;
        this.f17208c = tL_updateNewChannelMessage;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f17206a) {
            case 0:
                this.f17207b.lambda$performSendMessageRequest$93(this.f17208c, this.d);
                return;
            default:
                this.f17207b.lambda$performSendMessageRequestMulti$68(this.f17208c, this.d);
                return;
        }
    }
}
