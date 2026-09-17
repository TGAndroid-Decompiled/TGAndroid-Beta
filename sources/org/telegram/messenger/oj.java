package org.telegram.messenger;

import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class oj implements Runnable {
    public final int f18669a;
    public final SendMessagesHelper f18670b;
    public final TLObject f18671c;
    public final TLRPC.InputMedia d;
    public final SendMessagesHelper.DelayedMessage f18672e;

    public oj(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10) {
        this.f18669a = i10;
        this.f18670b = sendMessagesHelper;
        this.f18671c = tLObject;
        this.d = inputMedia;
        this.f18672e = delayedMessage;
    }

    @Override
    public final void run() {
        switch (this.f18669a) {
            case 0:
                this.f18670b.lambda$uploadMultiMedia$59(this.f18671c, this.d, this.f18672e);
                return;
            default:
                this.f18670b.lambda$performSendDelayedMessage$51(this.f18671c, this.d, this.f18672e);
                return;
        }
    }
}
