package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class ti implements Runnable {
    public final int f19694a;
    public final SendMessagesHelper f19695b;
    public final TL_update.TL_updateNewChannelMessage f19696c;

    public ti(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, int i10) {
        this.f19694a = i10;
        this.f19695b = sendMessagesHelper;
        this.f19696c = tL_updateNewChannelMessage;
    }

    @Override
    public final void run() {
        switch (this.f19694a) {
            case 0:
                this.f19695b.lambda$performSendMessageRequest$95(this.f19696c);
                return;
            default:
                this.f19695b.lambda$performSendMessageRequestMulti$70(this.f19696c);
                return;
        }
    }
}
