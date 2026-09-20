package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class aj implements Runnable {
    public final int f15911a;
    public final SendMessagesHelper f15912b;
    public final TL_update.TL_updateNewChannelMessage f15913c;
    public final long d;

    public aj(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, long j3, int i10) {
        this.f15911a = i10;
        this.f15912b = sendMessagesHelper;
        this.f15913c = tL_updateNewChannelMessage;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f15911a) {
            case 0:
                this.f15912b.lambda$performSendMessageRequest$93(this.f15913c, this.d);
                return;
            default:
                this.f15912b.lambda$performSendMessageRequestMulti$68(this.f15913c, this.d);
                return;
        }
    }
}
