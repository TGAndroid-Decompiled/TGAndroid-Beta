package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class bj implements Runnable {
    public final int f15969a;
    public final SendMessagesHelper f15970b;
    public final TL_update.TL_updateNewChannelMessage f15971c;
    public final long d;

    public bj(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, long j3, int i10) {
        this.f15969a = i10;
        this.f15970b = sendMessagesHelper;
        this.f15971c = tL_updateNewChannelMessage;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f15969a) {
            case 0:
                this.f15970b.lambda$performSendMessageRequest$93(this.f15971c, this.d);
                return;
            default:
                this.f15970b.lambda$performSendMessageRequestMulti$68(this.f15971c, this.d);
                return;
        }
    }
}
