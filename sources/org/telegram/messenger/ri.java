package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class ri implements Runnable {
    public final int f19436a;
    public final SendMessagesHelper f19437b;
    public final TL_update.TL_updateNewChannelMessage f19438c;
    public final long d;

    public ri(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, long j10, int i10) {
        this.f19436a = i10;
        this.f19437b = sendMessagesHelper;
        this.f19438c = tL_updateNewChannelMessage;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19436a) {
            case 0:
                this.f19437b.lambda$performSendMessageRequest$96(this.f19438c, this.d);
                return;
            default:
                this.f19437b.lambda$performSendMessageRequestMulti$71(this.f19438c, this.d);
                return;
        }
    }
}
