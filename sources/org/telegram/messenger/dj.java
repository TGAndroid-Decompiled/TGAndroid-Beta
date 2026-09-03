package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class dj implements Runnable {
    public final int f18518a;
    public final SendMessagesHelper f18519b;
    public final TL_update.TL_updateNewChannelMessage f18520c;
    public final long d;

    public dj(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, long j10, int i10) {
        this.f18518a = i10;
        this.f18519b = sendMessagesHelper;
        this.f18520c = tL_updateNewChannelMessage;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f18518a) {
            case 0:
                this.f18519b.lambda$performSendMessageRequest$93(this.f18520c, this.d);
                return;
            default:
                this.f18519b.lambda$performSendMessageRequestMulti$68(this.f18520c, this.d);
                return;
        }
    }
}
