package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class si implements Runnable {
    public final int f19519a;
    public final SendMessagesHelper f19520b;
    public final TL_update.TL_updateNewChannelMessage f19521c;
    public final long d;

    public si(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, long j10, int i10) {
        this.f19519a = i10;
        this.f19520b = sendMessagesHelper;
        this.f19521c = tL_updateNewChannelMessage;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19519a) {
            case 0:
                this.f19520b.lambda$performSendMessageRequest$96(this.f19521c, this.d);
                return;
            default:
                this.f19520b.lambda$performSendMessageRequestMulti$71(this.f19521c, this.d);
                return;
        }
    }
}
