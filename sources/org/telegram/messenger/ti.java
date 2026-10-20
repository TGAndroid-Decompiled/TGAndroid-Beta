package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class ti implements Runnable {
    public final int f19611a;
    public final SendMessagesHelper f19612b;
    public final TL_update.TL_updateNewChannelMessage f19613c;
    public final long d;

    public ti(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, long j10, int i10) {
        this.f19611a = i10;
        this.f19612b = sendMessagesHelper;
        this.f19613c = tL_updateNewChannelMessage;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19611a) {
            case 0:
                this.f19612b.lambda$performSendMessageRequest$96(this.f19613c, this.d);
                return;
            default:
                this.f19612b.lambda$performSendMessageRequestMulti$71(this.f19613c, this.d);
                return;
        }
    }
}
