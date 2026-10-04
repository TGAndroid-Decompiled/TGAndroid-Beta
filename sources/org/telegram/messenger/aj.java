package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class aj implements Runnable {
    public final int f17364a;
    public final SendMessagesHelper f17365b;
    public final TL_update.TL_updateNewChannelMessage f17366c;
    public final long d;

    public aj(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, long j3, int i10) {
        this.f17364a = i10;
        this.f17365b = sendMessagesHelper;
        this.f17366c = tL_updateNewChannelMessage;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f17364a) {
            case 0:
                this.f17365b.lambda$performSendMessageRequest$93(this.f17366c, this.d);
                return;
            default:
                this.f17365b.lambda$performSendMessageRequestMulti$68(this.f17366c, this.d);
                return;
        }
    }
}
