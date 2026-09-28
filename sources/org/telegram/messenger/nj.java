package org.telegram.messenger;

import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nj implements Runnable {
    public final int f17148a;
    public final SendMessagesHelper f17149b;
    public final TLObject f17150c;
    public final TLRPC.InputMedia d;
    public final SendMessagesHelper.DelayedMessage e;

    public nj(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10) {
        this.f17148a = i10;
        this.f17149b = sendMessagesHelper;
        this.f17150c = tLObject;
        this.d = inputMedia;
        this.e = delayedMessage;
    }

    @Override
    public final void run() {
        switch (this.f17148a) {
            case 0:
                this.f17149b.lambda$uploadMultiMedia$59(this.f17150c, this.d, this.e);
                return;
            default:
                this.f17149b.lambda$performSendDelayedMessage$51(this.f17150c, this.d, this.e);
                return;
        }
    }
}
