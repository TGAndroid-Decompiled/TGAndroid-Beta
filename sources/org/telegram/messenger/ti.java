package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class ti implements Runnable {
    public final int f19629a;
    public final SendMessagesHelper f19630b;
    public final TL_update.TL_updateNewChannelMessage f19631c;

    public ti(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, int i10) {
        this.f19629a = i10;
        this.f19630b = sendMessagesHelper;
        this.f19631c = tL_updateNewChannelMessage;
    }

    @Override
    public final void run() {
        switch (this.f19629a) {
            case 0:
                this.f19630b.lambda$performSendMessageRequest$95(this.f19631c);
                return;
            default:
                this.f19630b.lambda$performSendMessageRequestMulti$70(this.f19631c);
                return;
        }
    }
}
