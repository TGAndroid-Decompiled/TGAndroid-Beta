package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class dj implements Runnable {
    public final int f17064a;
    public final SendMessagesHelper f17065b;
    public final TL_update.TL_updateNewChannelMessage f17066c;
    public final long d;

    public dj(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, long j10, int i10) {
        this.f17064a = i10;
        this.f17065b = sendMessagesHelper;
        this.f17066c = tL_updateNewChannelMessage;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f17064a) {
            case 0:
                this.f17065b.lambda$performSendMessageRequest$93(this.f17066c, this.d);
                return;
            default:
                this.f17065b.lambda$performSendMessageRequestMulti$68(this.f17066c, this.d);
                return;
        }
    }
}
