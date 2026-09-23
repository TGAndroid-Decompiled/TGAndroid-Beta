package org.telegram.messenger;

import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class oj implements Runnable {
    public final int f16979a;
    public final SendMessagesHelper f16980b;
    public final TLObject f16981c;
    public final TLRPC.InputMedia d;
    public final SendMessagesHelper.DelayedMessage e;

    public oj(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10) {
        this.f16979a = i10;
        this.f16980b = sendMessagesHelper;
        this.f16981c = tLObject;
        this.d = inputMedia;
        this.e = delayedMessage;
    }

    @Override
    public final void run() {
        switch (this.f16979a) {
            case 0:
                this.f16980b.lambda$uploadMultiMedia$59(this.f16981c, this.d, this.e);
                return;
            default:
                this.f16980b.lambda$performSendDelayedMessage$51(this.f16981c, this.d, this.e);
                return;
        }
    }
}
