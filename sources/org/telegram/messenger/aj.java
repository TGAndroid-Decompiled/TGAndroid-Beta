package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class aj implements Runnable {
    public final int f17179a;
    public final SendMessagesHelper f17180b;
    public final TL_update.TL_updateNewChannelMessage f17181c;
    public final long d;

    public aj(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, long j3, int i10) {
        this.f17179a = i10;
        this.f17180b = sendMessagesHelper;
        this.f17181c = tL_updateNewChannelMessage;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f17179a) {
            case 0:
                this.f17180b.lambda$performSendMessageRequest$93(this.f17181c, this.d);
                return;
            default:
                this.f17180b.lambda$performSendMessageRequestMulti$68(this.f17181c, this.d);
                return;
        }
    }
}
