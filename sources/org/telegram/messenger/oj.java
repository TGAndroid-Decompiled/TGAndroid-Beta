package org.telegram.messenger;

import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class oj implements Runnable {
    public final int f17203a;
    public final SendMessagesHelper f17204b;
    public final TLObject f17205c;
    public final TLRPC.InputMedia d;
    public final SendMessagesHelper.DelayedMessage e;

    public oj(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10) {
        this.f17203a = i10;
        this.f17204b = sendMessagesHelper;
        this.f17205c = tLObject;
        this.d = inputMedia;
        this.e = delayedMessage;
    }

    @Override
    public final void run() {
        switch (this.f17203a) {
            case 0:
                this.f17204b.lambda$uploadMultiMedia$59(this.f17205c, this.d, this.e);
                return;
            default:
                this.f17204b.lambda$performSendDelayedMessage$51(this.f17205c, this.d, this.e);
                return;
        }
    }
}
