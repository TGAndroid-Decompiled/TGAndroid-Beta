package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class xi implements Runnable {
    public final int f21853a;
    public final SendMessagesHelper f21854b;
    public final TL_update.TL_updateNewChannelMessage f21855c;

    public xi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, int i10) {
        this.f21853a = i10;
        this.f21854b = sendMessagesHelper;
        this.f21855c = tL_updateNewChannelMessage;
    }

    @Override
    public final void run() {
        switch (this.f21853a) {
            case 0:
                this.f21854b.lambda$performSendMessageRequest$95(this.f21855c);
                return;
            default:
                this.f21854b.lambda$performSendMessageRequestMulti$70(this.f21855c);
                return;
        }
    }
}
