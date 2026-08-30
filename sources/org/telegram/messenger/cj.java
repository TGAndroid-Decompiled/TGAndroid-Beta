package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class cj implements Runnable {
    public final int f17003a;
    public final SendMessagesHelper f17004b;
    public final TL_update.TL_updateNewChannelMessage f17005c;
    public final long d;

    public cj(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, long j10, int i10) {
        this.f17003a = i10;
        this.f17004b = sendMessagesHelper;
        this.f17005c = tL_updateNewChannelMessage;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f17003a) {
            case 0:
                this.f17004b.lambda$performSendMessageRequest$93(this.f17005c, this.d);
                return;
            default:
                this.f17004b.lambda$performSendMessageRequestMulti$68(this.f17005c, this.d);
                return;
        }
    }
}
