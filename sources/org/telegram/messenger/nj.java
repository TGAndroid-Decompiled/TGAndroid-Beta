package org.telegram.messenger;

import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nj implements Runnable {
    public final int f18722a;
    public final SendMessagesHelper f18723b;
    public final TLObject f18724c;
    public final TLRPC.InputMedia d;
    public final SendMessagesHelper.DelayedMessage f18725e;

    public nj(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10) {
        this.f18722a = i10;
        this.f18723b = sendMessagesHelper;
        this.f18724c = tLObject;
        this.d = inputMedia;
        this.f18725e = delayedMessage;
    }

    @Override
    public final void run() {
        switch (this.f18722a) {
            case 0:
                this.f18723b.lambda$uploadMultiMedia$59(this.f18724c, this.d, this.f18725e);
                return;
            default:
                this.f18723b.lambda$performSendDelayedMessage$51(this.f18724c, this.d, this.f18725e);
                return;
        }
    }
}
