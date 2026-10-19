package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class qi implements Runnable {
    public final int f19368a;
    public final SendMessagesHelper f19369b;
    public final TL_update.TL_updateNewChannelMessage f19370c;

    public qi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, int i10) {
        this.f19368a = i10;
        this.f19369b = sendMessagesHelper;
        this.f19370c = tL_updateNewChannelMessage;
    }

    @Override
    public final void run() {
        switch (this.f19368a) {
            case 0:
                this.f19369b.lambda$performSendMessageRequest$95(this.f19370c);
                return;
            default:
                this.f19369b.lambda$performSendMessageRequestMulti$70(this.f19370c);
                return;
        }
    }
}
