package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class dj implements Runnable {
    public final int f18516a;
    public final SendMessagesHelper f18517b;
    public final TL_update.TL_updateNewChannelMessage f18518c;
    public final long d;

    public dj(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, long j10, int i10) {
        this.f18516a = i10;
        this.f18517b = sendMessagesHelper;
        this.f18518c = tL_updateNewChannelMessage;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f18516a) {
            case 0:
                this.f18517b.lambda$performSendMessageRequest$93(this.f18518c, this.d);
                return;
            default:
                this.f18517b.lambda$performSendMessageRequestMulti$68(this.f18518c, this.d);
                return;
        }
    }
}
