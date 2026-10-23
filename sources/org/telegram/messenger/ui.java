package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class ui implements Runnable {
    public final int f19775a;
    public final SendMessagesHelper f19776b;
    public final TL_update.TL_updateNewChannelMessage f19777c;
    public final long d;

    public ui(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, long j10, int i10) {
        this.f19775a = i10;
        this.f19776b = sendMessagesHelper;
        this.f19777c = tL_updateNewChannelMessage;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19775a) {
            case 0:
                this.f19776b.lambda$performSendMessageRequest$96(this.f19777c, this.d);
                return;
            default:
                this.f19776b.lambda$performSendMessageRequestMulti$71(this.f19777c, this.d);
                return;
        }
    }
}
