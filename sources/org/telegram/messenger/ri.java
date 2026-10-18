package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class ri implements Runnable {
    public final int f19439a;
    public final SendMessagesHelper f19440b;
    public final TL_update.TL_updateNewChannelMessage f19441c;
    public final long d;

    public ri(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, long j10, int i10) {
        this.f19439a = i10;
        this.f19440b = sendMessagesHelper;
        this.f19441c = tL_updateNewChannelMessage;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19439a) {
            case 0:
                this.f19440b.lambda$performSendMessageRequest$96(this.f19441c, this.d);
                return;
            default:
                this.f19440b.lambda$performSendMessageRequestMulti$71(this.f19441c, this.d);
                return;
        }
    }
}
