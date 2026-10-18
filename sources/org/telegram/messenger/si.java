package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class si implements Runnable {
    public final int f19516a;
    public final SendMessagesHelper f19517b;
    public final TL_update.TL_updateNewChannelMessage f19518c;
    public final long d;

    public si(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, long j10, int i10) {
        this.f19516a = i10;
        this.f19517b = sendMessagesHelper;
        this.f19518c = tL_updateNewChannelMessage;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19516a) {
            case 0:
                this.f19517b.lambda$performSendMessageRequest$96(this.f19518c, this.d);
                return;
            default:
                this.f19517b.lambda$performSendMessageRequestMulti$71(this.f19518c, this.d);
                return;
        }
    }
}
