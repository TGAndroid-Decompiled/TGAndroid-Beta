package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class wi implements Runnable {
    public final int f19764a;
    public final SendMessagesHelper f19765b;
    public final TL_update.TL_updateNewChannelMessage f19766c;
    public final long d;

    public wi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, long j3, int i10) {
        this.f19764a = i10;
        this.f19765b = sendMessagesHelper;
        this.f19766c = tL_updateNewChannelMessage;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f19764a) {
            case 0:
                this.f19765b.lambda$performSendMessageRequest$96(this.f19766c, this.d);
                return;
            default:
                this.f19765b.lambda$performSendMessageRequestMulti$71(this.f19766c, this.d);
                return;
        }
    }
}
