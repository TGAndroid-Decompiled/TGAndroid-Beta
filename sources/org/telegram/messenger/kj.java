package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class kj implements Runnable {

    public final int f20803a;

    public final SendMessagesHelper f20804b;

    public final TLObject f20805c;
    public final TLRPC.InputMedia d;

    public final SendMessagesHelper.DelayedMessage f20806e;

    public kj(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10) {
        this.f20803a = i10;
        this.f20804b = sendMessagesHelper;
        this.f20805c = tLObject;
        this.d = inputMedia;
        this.f20806e = delayedMessage;
    }

    @Override
    public final void run() {
        switch (this.f20803a) {
            case 0:
                this.f20804b.lambda$uploadMultiMedia$59(this.f20805c, this.d, this.f20806e);
                break;
            default:
                this.f20804b.lambda$performSendDelayedMessage$51(this.f20805c, this.d, this.f20806e);
                break;
        }
    }
}
