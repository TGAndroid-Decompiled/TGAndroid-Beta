package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class ui implements Runnable {
    public final int f19710a;
    public final SendMessagesHelper f19711b;
    public final TL_update.TL_updateNewChannelMessage f19712c;
    public final long d;

    public ui(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, long j10, int i10) {
        this.f19710a = i10;
        this.f19711b = sendMessagesHelper;
        this.f19712c = tL_updateNewChannelMessage;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19710a) {
            case 0:
                this.f19711b.lambda$performSendMessageRequest$96(this.f19712c, this.d);
                return;
            default:
                this.f19711b.lambda$performSendMessageRequestMulti$71(this.f19712c, this.d);
                return;
        }
    }
}
