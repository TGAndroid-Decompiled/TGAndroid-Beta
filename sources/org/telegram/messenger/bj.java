package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class bj implements Runnable {
    public final int f17198a;
    public final SendMessagesHelper f17199b;
    public final TL_update.TL_updateNewChannelMessage f17200c;
    public final long d;

    public bj(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, long j3, int i10) {
        this.f17198a = i10;
        this.f17199b = sendMessagesHelper;
        this.f17200c = tL_updateNewChannelMessage;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f17198a) {
            case 0:
                this.f17199b.lambda$performSendMessageRequest$96(this.f17200c, this.d);
                return;
            default:
                this.f17199b.lambda$performSendMessageRequestMulti$71(this.f17200c, this.d);
                return;
        }
    }
}
