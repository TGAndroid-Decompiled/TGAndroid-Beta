package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class vi implements Runnable {
    public final int f19444a;
    public final SendMessagesHelper f19445b;
    public final TL_update.TL_updateNewChannelMessage f19446c;

    public vi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, int i10) {
        this.f19444a = i10;
        this.f19445b = sendMessagesHelper;
        this.f19446c = tL_updateNewChannelMessage;
    }

    @Override
    public final void run() {
        switch (this.f19444a) {
            case 0:
                this.f19445b.lambda$performSendMessageRequest$95(this.f19446c);
                return;
            default:
                this.f19445b.lambda$performSendMessageRequestMulti$70(this.f19446c);
                return;
        }
    }
}
