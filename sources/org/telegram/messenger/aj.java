package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class aj implements Runnable {
    public final int f17369a;
    public final SendMessagesHelper f17370b;
    public final TL_update.TL_updateNewChannelMessage f17371c;
    public final long d;

    public aj(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, long j3, int i10) {
        this.f17369a = i10;
        this.f17370b = sendMessagesHelper;
        this.f17371c = tL_updateNewChannelMessage;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f17369a) {
            case 0:
                this.f17370b.lambda$performSendMessageRequest$93(this.f17371c, this.d);
                return;
            default:
                this.f17370b.lambda$performSendMessageRequestMulti$68(this.f17371c, this.d);
                return;
        }
    }
}
