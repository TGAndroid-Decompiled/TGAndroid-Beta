package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class xi implements Runnable {
    public final int f21851a;
    public final SendMessagesHelper f21852b;
    public final TL_update.TL_updateNewChannelMessage f21853c;
    public final long d;

    public xi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, long j10, int i10) {
        this.f21851a = i10;
        this.f21852b = sendMessagesHelper;
        this.f21853c = tL_updateNewChannelMessage;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f21851a) {
            case 0:
                this.f21852b.lambda$performSendMessageRequest$96(this.f21853c, this.d);
                return;
            default:
                this.f21852b.lambda$performSendMessageRequestMulti$71(this.f21853c, this.d);
                return;
        }
    }
}
