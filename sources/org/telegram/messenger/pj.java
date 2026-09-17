package org.telegram.messenger;

import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pj implements Runnable {
    public final int f17091a;
    public final SendMessagesHelper f17092b;
    public final TLObject f17093c;
    public final TLRPC.InputMedia d;
    public final SendMessagesHelper.DelayedMessage e;

    public pj(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10) {
        this.f17091a = i10;
        this.f17092b = sendMessagesHelper;
        this.f17093c = tLObject;
        this.d = inputMedia;
        this.e = delayedMessage;
    }

    @Override
    public final void run() {
        switch (this.f17091a) {
            case 0:
                this.f17092b.lambda$uploadMultiMedia$59(this.f17093c, this.d, this.e);
                return;
            default:
                this.f17092b.lambda$performSendDelayedMessage$51(this.f17093c, this.d, this.e);
                return;
        }
    }
}
