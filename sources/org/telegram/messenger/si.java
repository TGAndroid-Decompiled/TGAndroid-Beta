package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class si implements Runnable {
    public final int f19541a;
    public final SendMessagesHelper f19542b;
    public final TL_update.TL_updateNewChannelMessage f19543c;

    public si(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, int i10) {
        this.f19541a = i10;
        this.f19542b = sendMessagesHelper;
        this.f19543c = tL_updateNewChannelMessage;
    }

    @Override
    public final void run() {
        switch (this.f19541a) {
            case 0:
                this.f19542b.lambda$performSendMessageRequest$95(this.f19543c);
                return;
            default:
                this.f19542b.lambda$performSendMessageRequestMulti$70(this.f19543c);
                return;
        }
    }
}
