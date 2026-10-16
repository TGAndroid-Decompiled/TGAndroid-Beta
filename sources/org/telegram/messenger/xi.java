package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class xi implements Runnable {
    public final int f18733a;
    public final SendMessagesHelper f18734b;
    public final TL_update.TL_updateNewChannelMessage f18735c;

    public xi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, int i10) {
        this.f18733a = i10;
        this.f18734b = sendMessagesHelper;
        this.f18735c = tL_updateNewChannelMessage;
    }

    @Override
    public final void run() {
        switch (this.f18733a) {
            case 0:
                this.f18734b.lambda$performSendMessageRequest$95(this.f18735c);
                return;
            default:
                this.f18734b.lambda$performSendMessageRequestMulti$70(this.f18735c);
                return;
        }
    }
}
