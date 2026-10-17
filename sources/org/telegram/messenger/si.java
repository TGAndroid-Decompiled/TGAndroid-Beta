package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class si implements Runnable {
    public final int f19507a;
    public final SendMessagesHelper f19508b;
    public final TL_update.TL_updateNewChannelMessage f19509c;
    public final long d;

    public si(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, long j10, int i10) {
        this.f19507a = i10;
        this.f19508b = sendMessagesHelper;
        this.f19509c = tL_updateNewChannelMessage;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19507a) {
            case 0:
                this.f19508b.lambda$performSendMessageRequest$96(this.f19509c, this.d);
                return;
            default:
                this.f19508b.lambda$performSendMessageRequestMulti$71(this.f19509c, this.d);
                return;
        }
    }
}
