package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class ti implements Runnable {
    public final int f19610a;
    public final SendMessagesHelper f19611b;
    public final TL_update.TL_updateNewChannelMessage f19612c;
    public final long d;

    public ti(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, long j10, int i10) {
        this.f19610a = i10;
        this.f19611b = sendMessagesHelper;
        this.f19612c = tL_updateNewChannelMessage;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19610a) {
            case 0:
                this.f19611b.lambda$performSendMessageRequest$96(this.f19612c, this.d);
                return;
            default:
                this.f19611b.lambda$performSendMessageRequestMulti$71(this.f19612c, this.d);
                return;
        }
    }
}
