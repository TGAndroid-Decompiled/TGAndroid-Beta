package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class aj implements Runnable {
    public final int f15690a;
    public final SendMessagesHelper f15691b;
    public final TL_update.TL_updateNewChannelMessage f15692c;
    public final long d;

    public aj(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, long j3, int i10) {
        this.f15690a = i10;
        this.f15691b = sendMessagesHelper;
        this.f15692c = tL_updateNewChannelMessage;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f15690a) {
            case 0:
                this.f15691b.lambda$performSendMessageRequest$93(this.f15692c, this.d);
                return;
            default:
                this.f15691b.lambda$performSendMessageRequestMulti$68(this.f15692c, this.d);
                return;
        }
    }
}
