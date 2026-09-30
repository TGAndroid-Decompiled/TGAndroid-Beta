package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class xi implements Runnable {
    public final int f18162a;
    public final SendMessagesHelper f18163b;
    public final TL_update.TL_updateNewMessage f18164c;

    public xi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewMessage tL_updateNewMessage, int i10) {
        this.f18162a = i10;
        this.f18163b = sendMessagesHelper;
        this.f18164c = tL_updateNewMessage;
    }

    @Override
    public final void run() {
        switch (this.f18162a) {
            case 0:
                this.f18163b.lambda$performSendMessageRequest$91(this.f18164c);
                return;
            default:
                this.f18163b.lambda$performSendMessageRequestMulti$66(this.f18164c);
                return;
        }
    }
}
