package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class aj implements Runnable {
    public final int f15926a;
    public final SendMessagesHelper f15927b;
    public final TL_update.TL_updateNewChannelMessage f15928c;
    public final long d;

    public aj(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, long j3, int i10) {
        this.f15926a = i10;
        this.f15927b = sendMessagesHelper;
        this.f15928c = tL_updateNewChannelMessage;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f15926a) {
            case 0:
                this.f15927b.lambda$performSendMessageRequest$93(this.f15928c, this.d);
                return;
            default:
                this.f15927b.lambda$performSendMessageRequestMulti$68(this.f15928c, this.d);
                return;
        }
    }
}
