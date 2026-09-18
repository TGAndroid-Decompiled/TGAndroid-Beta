package org.telegram.messenger;

import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pj implements Runnable {
    public final int f17258a;
    public final SendMessagesHelper f17259b;
    public final TLObject f17260c;
    public final TLRPC.InputMedia d;
    public final SendMessagesHelper.DelayedMessage e;

    public pj(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10) {
        this.f17258a = i10;
        this.f17259b = sendMessagesHelper;
        this.f17260c = tLObject;
        this.d = inputMedia;
        this.e = delayedMessage;
    }

    @Override
    public final void run() {
        switch (this.f17258a) {
            case 0:
                this.f17259b.lambda$uploadMultiMedia$59(this.f17260c, this.d, this.e);
                return;
            default:
                this.f17259b.lambda$performSendDelayedMessage$51(this.f17260c, this.d, this.e);
                return;
        }
    }
}
