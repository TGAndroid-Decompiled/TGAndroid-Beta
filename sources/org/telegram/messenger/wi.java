package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class wi implements Runnable {
    public final int f19735a;
    public final SendMessagesHelper f19736b;
    public final TL_update.TL_updateNewChannelMessage f19737c;

    public wi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, int i10) {
        this.f19735a = i10;
        this.f19736b = sendMessagesHelper;
        this.f19737c = tL_updateNewChannelMessage;
    }

    @Override
    public final void run() {
        switch (this.f19735a) {
            case 0:
                this.f19736b.lambda$performSendMessageRequest$95(this.f19737c);
                return;
            default:
                this.f19736b.lambda$performSendMessageRequestMulti$70(this.f19737c);
                return;
        }
    }
}
