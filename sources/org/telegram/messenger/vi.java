package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;

public final class vi implements Runnable {

    public final int f21817a;

    public final SendMessagesHelper f21818b;

    public final TL_update.TL_updateNewChannelMessage f21819c;
    public final long d;

    public vi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, long j10, int i10) {
        this.f21817a = i10;
        this.f21818b = sendMessagesHelper;
        this.f21819c = tL_updateNewChannelMessage;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f21817a) {
            case 0:
                this.f21818b.lambda$performSendMessageRequest$93(this.f21819c, this.d);
                break;
            default:
                this.f21818b.lambda$performSendMessageRequestMulti$68(this.f21819c, this.d);
                break;
        }
    }
}
