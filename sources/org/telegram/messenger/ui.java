package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class ui implements Runnable {
    public final int f19705a;
    public final SendMessagesHelper f19706b;
    public final TL_update.TL_updateNewChannelMessage f19707c;

    public ui(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, int i10) {
        this.f19705a = i10;
        this.f19706b = sendMessagesHelper;
        this.f19707c = tL_updateNewChannelMessage;
    }

    @Override
    public final void run() {
        switch (this.f19705a) {
            case 0:
                this.f19706b.lambda$performSendMessageRequest$95(this.f19707c);
                return;
            default:
                this.f19706b.lambda$performSendMessageRequestMulti$70(this.f19707c);
                return;
        }
    }
}
