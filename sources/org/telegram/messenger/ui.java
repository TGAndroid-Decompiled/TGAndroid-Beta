package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class ui implements Runnable {
    public final int f19770a;
    public final SendMessagesHelper f19771b;
    public final TL_update.TL_updateNewChannelMessage f19772c;

    public ui(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, int i10) {
        this.f19770a = i10;
        this.f19771b = sendMessagesHelper;
        this.f19772c = tL_updateNewChannelMessage;
    }

    @Override
    public final void run() {
        switch (this.f19770a) {
            case 0:
                this.f19771b.lambda$performSendMessageRequest$95(this.f19772c);
                return;
            default:
                this.f19771b.lambda$performSendMessageRequestMulti$70(this.f19772c);
                return;
        }
    }
}
