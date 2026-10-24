package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class vi implements Runnable {
    public final int f19846a;
    public final SendMessagesHelper f19847b;
    public final TL_update.TL_updateNewChannelMessage f19848c;
    public final long d;

    public vi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, long j10, int i10) {
        this.f19846a = i10;
        this.f19847b = sendMessagesHelper;
        this.f19848c = tL_updateNewChannelMessage;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19846a) {
            case 0:
                this.f19847b.lambda$performSendMessageRequest$96(this.f19848c, this.d);
                return;
            default:
                this.f19847b.lambda$performSendMessageRequestMulti$71(this.f19848c, this.d);
                return;
        }
    }
}
