package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class ui implements Runnable {
    public final int f19396a;
    public final SendMessagesHelper f19397b;
    public final TL_update.TL_updateNewMessage f19398c;

    public ui(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewMessage tL_updateNewMessage, int i10) {
        this.f19396a = i10;
        this.f19397b = sendMessagesHelper;
        this.f19398c = tL_updateNewMessage;
    }

    @Override
    public final void run() {
        switch (this.f19396a) {
            case 0:
                this.f19397b.lambda$performSendMessageRequest$94(this.f19398c);
                return;
            case 1:
                this.f19397b.lambda$performSendMessageRequestMulti$69(this.f19398c);
                return;
            default:
                this.f19397b.lambda$completeSendingGramTransfer$5(this.f19398c);
                return;
        }
    }
}
