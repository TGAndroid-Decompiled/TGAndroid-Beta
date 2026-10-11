package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class ui implements Runnable {
    public final int f19360a;
    public final SendMessagesHelper f19361b;
    public final TL_update.TL_updateNewMessage f19362c;

    public ui(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewMessage tL_updateNewMessage, int i10) {
        this.f19360a = i10;
        this.f19361b = sendMessagesHelper;
        this.f19362c = tL_updateNewMessage;
    }

    @Override
    public final void run() {
        switch (this.f19360a) {
            case 0:
                this.f19361b.lambda$performSendMessageRequest$94(this.f19362c);
                return;
            case 1:
                this.f19361b.lambda$performSendMessageRequestMulti$69(this.f19362c);
                return;
            default:
                this.f19361b.lambda$completeSendingGramTransfer$5(this.f19362c);
                return;
        }
    }
}
