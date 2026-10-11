package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class wi implements Runnable {
    public final int f19728a;
    public final SendMessagesHelper f19729b;
    public final TL_update.TL_updateNewChannelMessage f19730c;
    public final long d;

    public wi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, long j3, int i10) {
        this.f19728a = i10;
        this.f19729b = sendMessagesHelper;
        this.f19730c = tL_updateNewChannelMessage;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f19728a) {
            case 0:
                this.f19729b.lambda$performSendMessageRequest$96(this.f19730c, this.d);
                return;
            default:
                this.f19729b.lambda$performSendMessageRequestMulti$71(this.f19730c, this.d);
                return;
        }
    }
}
