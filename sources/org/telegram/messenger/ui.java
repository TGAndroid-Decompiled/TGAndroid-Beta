package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;

public final class ui implements Runnable {

    public final int f21740a;

    public final SendMessagesHelper f21741b;

    public final TL_update.TL_updateNewChannelMessage f21742c;

    public ui(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, int i10) {
        this.f21740a = i10;
        this.f21741b = sendMessagesHelper;
        this.f21742c = tL_updateNewChannelMessage;
    }

    @Override
    public final void run() {
        switch (this.f21740a) {
            case 0:
                this.f21741b.lambda$performSendMessageRequest$92(this.f21742c);
                break;
            default:
                this.f21741b.lambda$performSendMessageRequestMulti$67(this.f21742c);
                break;
        }
    }
}
