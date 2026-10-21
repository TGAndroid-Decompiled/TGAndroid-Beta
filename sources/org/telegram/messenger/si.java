package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class si implements Runnable {
    public final int f19538a;
    public final SendMessagesHelper f19539b;
    public final TL_update.TL_updateNewChannelMessage f19540c;

    public si(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, int i10) {
        this.f19538a = i10;
        this.f19539b = sendMessagesHelper;
        this.f19540c = tL_updateNewChannelMessage;
    }

    @Override
    public final void run() {
        switch (this.f19538a) {
            case 0:
                this.f19539b.lambda$performSendMessageRequest$95(this.f19540c);
                return;
            default:
                this.f19539b.lambda$performSendMessageRequestMulti$70(this.f19540c);
                return;
        }
    }
}
