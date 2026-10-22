package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class vi implements Runnable {
    public final int f19783a;
    public final SendMessagesHelper f19784b;
    public final TL_update.TL_updateNewChannelMessage f19785c;
    public final long d;

    public vi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, long j10, int i10) {
        this.f19783a = i10;
        this.f19784b = sendMessagesHelper;
        this.f19785c = tL_updateNewChannelMessage;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19783a) {
            case 0:
                this.f19784b.lambda$performSendMessageRequest$96(this.f19785c, this.d);
                return;
            default:
                this.f19784b.lambda$performSendMessageRequestMulti$71(this.f19785c, this.d);
                return;
        }
    }
}
