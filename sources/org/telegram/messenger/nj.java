package org.telegram.messenger;

import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nj implements Runnable {
    public final int f17149a;
    public final SendMessagesHelper f17150b;
    public final TLObject f17151c;
    public final TLRPC.InputMedia d;
    public final SendMessagesHelper.DelayedMessage e;

    public nj(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10) {
        this.f17149a = i10;
        this.f17150b = sendMessagesHelper;
        this.f17151c = tLObject;
        this.d = inputMedia;
        this.e = delayedMessage;
    }

    @Override
    public final void run() {
        switch (this.f17149a) {
            case 0:
                this.f17150b.lambda$uploadMultiMedia$59(this.f17151c, this.d, this.e);
                return;
            default:
                this.f17150b.lambda$performSendDelayedMessage$51(this.f17151c, this.d, this.e);
                return;
        }
    }
}
