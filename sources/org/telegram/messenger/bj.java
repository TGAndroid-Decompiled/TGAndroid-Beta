package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class bj implements Runnable {
    public final int f17197a;
    public final SendMessagesHelper f17198b;
    public final TL_update.TL_updateNewChannelMessage f17199c;
    public final long d;

    public bj(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, long j3, int i10) {
        this.f17197a = i10;
        this.f17198b = sendMessagesHelper;
        this.f17199c = tL_updateNewChannelMessage;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f17197a) {
            case 0:
                this.f17198b.lambda$performSendMessageRequest$96(this.f17199c, this.d);
                return;
            default:
                this.f17198b.lambda$performSendMessageRequestMulti$71(this.f17199c, this.d);
                return;
        }
    }
}
