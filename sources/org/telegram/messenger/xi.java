package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class xi implements Runnable {
    public final int f19834a;
    public final SendMessagesHelper f19835b;
    public final TL_update.TL_updateNewChannelMessage f19836c;
    public final long d;

    public xi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, long j3, int i10) {
        this.f19834a = i10;
        this.f19835b = sendMessagesHelper;
        this.f19836c = tL_updateNewChannelMessage;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f19834a) {
            case 0:
                this.f19835b.lambda$performSendMessageRequest$96(this.f19836c, this.d);
                return;
            default:
                this.f19835b.lambda$performSendMessageRequestMulti$71(this.f19836c, this.d);
                return;
        }
    }
}
