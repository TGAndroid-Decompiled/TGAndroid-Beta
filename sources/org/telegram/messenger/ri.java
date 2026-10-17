package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class ri implements Runnable {
    public final int f19436a;
    public final SendMessagesHelper f19437b;
    public final TL_update.TL_updateNewChannelMessage f19438c;

    public ri(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, int i10) {
        this.f19436a = i10;
        this.f19437b = sendMessagesHelper;
        this.f19438c = tL_updateNewChannelMessage;
    }

    @Override
    public final void run() {
        switch (this.f19436a) {
            case 0:
                this.f19437b.lambda$performSendMessageRequest$95(this.f19438c);
                return;
            default:
                this.f19437b.lambda$performSendMessageRequestMulti$70(this.f19438c);
                return;
        }
    }
}
