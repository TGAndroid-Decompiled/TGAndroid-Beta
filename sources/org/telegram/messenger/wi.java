package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class wi implements Runnable {
    public final int f21771a;
    public final SendMessagesHelper f21772b;
    public final TL_update.TL_updateNewChannelMessage f21773c;

    public wi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, int i10) {
        this.f21771a = i10;
        this.f21772b = sendMessagesHelper;
        this.f21773c = tL_updateNewChannelMessage;
    }

    @Override
    public final void run() {
        switch (this.f21771a) {
            case 0:
                this.f21772b.lambda$performSendMessageRequest$95(this.f21773c);
                return;
            default:
                this.f21772b.lambda$performSendMessageRequestMulti$70(this.f21773c);
                return;
        }
    }
}
