package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class xi implements Runnable {
    public final int f19689a;
    public final SendMessagesHelper f19690b;
    public final TL_update.TL_updateNewMessage f19691c;

    public xi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewMessage tL_updateNewMessage, int i10) {
        this.f19689a = i10;
        this.f19690b = sendMessagesHelper;
        this.f19691c = tL_updateNewMessage;
    }

    @Override
    public final void run() {
        switch (this.f19689a) {
            case 0:
                this.f19690b.lambda$performSendMessageRequest$91(this.f19691c);
                return;
            default:
                this.f19690b.lambda$performSendMessageRequestMulti$66(this.f19691c);
                return;
        }
    }
}
