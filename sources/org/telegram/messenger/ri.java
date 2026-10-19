package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class ri implements Runnable {
    public final int f19448a;
    public final SendMessagesHelper f19449b;
    public final TL_update.TL_updateNewChannelMessage f19450c;

    public ri(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, int i10) {
        this.f19448a = i10;
        this.f19449b = sendMessagesHelper;
        this.f19450c = tL_updateNewChannelMessage;
    }

    @Override
    public final void run() {
        switch (this.f19448a) {
            case 0:
                this.f19449b.lambda$performSendMessageRequest$95(this.f19450c);
                return;
            default:
                this.f19449b.lambda$performSendMessageRequestMulti$70(this.f19450c);
                return;
        }
    }
}
