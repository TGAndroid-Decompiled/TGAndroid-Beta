package org.telegram.messenger;

import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nj implements Runnable {
    public final int f17142a;
    public final SendMessagesHelper f17143b;
    public final TLObject f17144c;
    public final TLRPC.InputMedia d;
    public final SendMessagesHelper.DelayedMessage e;

    public nj(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10) {
        this.f17142a = i10;
        this.f17143b = sendMessagesHelper;
        this.f17144c = tLObject;
        this.d = inputMedia;
        this.e = delayedMessage;
    }

    @Override
    public final void run() {
        switch (this.f17142a) {
            case 0:
                this.f17143b.lambda$uploadMultiMedia$59(this.f17144c, this.d, this.e);
                return;
            default:
                this.f17143b.lambda$performSendDelayedMessage$51(this.f17144c, this.d, this.e);
                return;
        }
    }
}
