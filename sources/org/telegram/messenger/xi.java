package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class xi implements Runnable {
    public final int f19830a;
    public final SendMessagesHelper f19831b;
    public final TL_update.TL_updateNewChannelMessage f19832c;
    public final long d;

    public xi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, long j3, int i10) {
        this.f19830a = i10;
        this.f19831b = sendMessagesHelper;
        this.f19832c = tL_updateNewChannelMessage;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f19830a) {
            case 0:
                this.f19831b.lambda$performSendMessageRequest$96(this.f19832c, this.d);
                return;
            default:
                this.f19831b.lambda$performSendMessageRequestMulti$71(this.f19832c, this.d);
                return;
        }
    }
}
