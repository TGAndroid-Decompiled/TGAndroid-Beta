package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class aj implements Runnable {
    public final int f15694a;
    public final SendMessagesHelper f15695b;
    public final TL_update.TL_updateNewChannelMessage f15696c;
    public final long d;

    public aj(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, long j3, int i10) {
        this.f15694a = i10;
        this.f15695b = sendMessagesHelper;
        this.f15696c = tL_updateNewChannelMessage;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f15694a) {
            case 0:
                this.f15695b.lambda$performSendMessageRequest$93(this.f15696c, this.d);
                return;
            default:
                this.f15695b.lambda$performSendMessageRequestMulti$68(this.f15696c, this.d);
                return;
        }
    }
}
