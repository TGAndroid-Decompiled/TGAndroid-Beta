package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class ri implements Runnable {
    public final int f19445a;
    public final SendMessagesHelper f19446b;
    public final TL_update.TL_updateNewChannelMessage f19447c;

    public ri(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, int i10) {
        this.f19445a = i10;
        this.f19446b = sendMessagesHelper;
        this.f19447c = tL_updateNewChannelMessage;
    }

    @Override
    public final void run() {
        switch (this.f19445a) {
            case 0:
                this.f19446b.lambda$performSendMessageRequest$95(this.f19447c);
                return;
            default:
                this.f19446b.lambda$performSendMessageRequestMulti$70(this.f19447c);
                return;
        }
    }
}
