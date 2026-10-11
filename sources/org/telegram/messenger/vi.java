package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class vi implements Runnable {
    public final int f19480a;
    public final SendMessagesHelper f19481b;
    public final TL_update.TL_updateNewChannelMessage f19482c;

    public vi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, int i10) {
        this.f19480a = i10;
        this.f19481b = sendMessagesHelper;
        this.f19482c = tL_updateNewChannelMessage;
    }

    @Override
    public final void run() {
        switch (this.f19480a) {
            case 0:
                this.f19481b.lambda$performSendMessageRequest$95(this.f19482c);
                return;
            default:
                this.f19481b.lambda$performSendMessageRequestMulti$70(this.f19482c);
                return;
        }
    }
}
