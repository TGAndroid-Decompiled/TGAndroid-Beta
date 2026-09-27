package org.telegram.messenger;

import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nj implements Runnable {
    public final int f17136a;
    public final SendMessagesHelper f17137b;
    public final TLObject f17138c;
    public final TLRPC.InputMedia d;
    public final SendMessagesHelper.DelayedMessage e;

    public nj(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10) {
        this.f17136a = i10;
        this.f17137b = sendMessagesHelper;
        this.f17138c = tLObject;
        this.d = inputMedia;
        this.e = delayedMessage;
    }

    @Override
    public final void run() {
        switch (this.f17136a) {
            case 0:
                this.f17137b.lambda$uploadMultiMedia$59(this.f17138c, this.d, this.e);
                return;
            default:
                this.f17137b.lambda$performSendDelayedMessage$51(this.f17138c, this.d, this.e);
                return;
        }
    }
}
