package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class wi implements Runnable {
    public final int f19731a;
    public final SendMessagesHelper f19732b;
    public final TL_update.TL_updateNewChannelMessage f19733c;

    public wi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, int i10) {
        this.f19731a = i10;
        this.f19732b = sendMessagesHelper;
        this.f19733c = tL_updateNewChannelMessage;
    }

    @Override
    public final void run() {
        switch (this.f19731a) {
            case 0:
                this.f19732b.lambda$performSendMessageRequest$95(this.f19733c);
                return;
            default:
                this.f19732b.lambda$performSendMessageRequestMulti$70(this.f19733c);
                return;
        }
    }
}
