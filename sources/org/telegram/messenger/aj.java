package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class aj implements Runnable {
    public final int f15703a;
    public final SendMessagesHelper f15704b;
    public final TL_update.TL_updateNewChannelMessage f15705c;
    public final long d;

    public aj(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, long j3, int i10) {
        this.f15703a = i10;
        this.f15704b = sendMessagesHelper;
        this.f15705c = tL_updateNewChannelMessage;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f15703a) {
            case 0:
                this.f15704b.lambda$performSendMessageRequest$93(this.f15705c, this.d);
                return;
            default:
                this.f15704b.lambda$performSendMessageRequestMulti$68(this.f15705c, this.d);
                return;
        }
    }
}
