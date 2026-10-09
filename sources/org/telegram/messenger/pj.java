package org.telegram.messenger;

import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pj implements Runnable {
    public final int f18876a;
    public final SendMessagesHelper f18877b;
    public final TLObject f18878c;
    public final TLRPC.InputMedia d;
    public final SendMessagesHelper.DelayedMessage f18879e;

    public pj(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10) {
        this.f18876a = i10;
        this.f18877b = sendMessagesHelper;
        this.f18878c = tLObject;
        this.d = inputMedia;
        this.f18879e = delayedMessage;
    }

    @Override
    public final void run() {
        switch (this.f18876a) {
            case 0:
                this.f18877b.lambda$performSendDelayedMessage$54(this.f18878c, this.d, this.f18879e);
                return;
            default:
                this.f18877b.lambda$uploadMultiMedia$62(this.f18878c, this.d, this.f18879e);
                return;
        }
    }
}
