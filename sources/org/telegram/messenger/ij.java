package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class ij implements Runnable {
    public final int f15474a;
    public final SendMessagesHelper f15475b;
    public final TL_update.TL_updateNewChannelMessage f15476c;
    public final long d;

    public ij(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, long j3, int i10) {
        this.f15474a = i10;
        this.f15475b = sendMessagesHelper;
        this.f15476c = tL_updateNewChannelMessage;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f15474a) {
            case 0:
                this.f15475b.lambda$performSendMessageRequest$93(this.f15476c, this.d);
                return;
            default:
                this.f15475b.lambda$performSendMessageRequestMulti$68(this.f15476c, this.d);
                return;
        }
    }
}
