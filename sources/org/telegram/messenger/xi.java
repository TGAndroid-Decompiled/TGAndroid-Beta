package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class xi implements Runnable {
    public final int f19662a;
    public final SendMessagesHelper f19663b;
    public final TL_update.TL_updateNewMessage f19664c;

    public xi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewMessage tL_updateNewMessage, int i10) {
        this.f19662a = i10;
        this.f19663b = sendMessagesHelper;
        this.f19664c = tL_updateNewMessage;
    }

    @Override
    public final void run() {
        switch (this.f19662a) {
            case 0:
                this.f19663b.lambda$performSendMessageRequest$91(this.f19664c);
                return;
            default:
                this.f19663b.lambda$performSendMessageRequestMulti$66(this.f19664c);
                return;
        }
    }
}
