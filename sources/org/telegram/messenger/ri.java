package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class ri implements Runnable {
    public final int f21422a;
    public final SendMessagesHelper f21423b;
    public final TL_update.TL_updateNewChannelMessage f21424c;
    public final long d;

    public ri(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, long j10, int i9) {
        this.f21422a = i9;
        this.f21423b = sendMessagesHelper;
        this.f21424c = tL_updateNewChannelMessage;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f21422a) {
            case 0:
                this.f21423b.lambda$performSendMessageRequest$93(this.f21424c, this.d);
                return;
            default:
                this.f21423b.lambda$performSendMessageRequestMulti$68(this.f21424c, this.d);
                return;
        }
    }
}
