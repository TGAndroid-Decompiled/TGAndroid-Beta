package org.telegram.messenger;

import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xj implements Runnable {
    public final int f17006a;
    public final SendMessagesHelper f17007b;
    public final TLObject f17008c;
    public final TLRPC.InputMedia d;
    public final SendMessagesHelper.DelayedMessage e;

    public xj(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10) {
        this.f17006a = i10;
        this.f17007b = sendMessagesHelper;
        this.f17008c = tLObject;
        this.d = inputMedia;
        this.e = delayedMessage;
    }

    @Override
    public final void run() {
        switch (this.f17006a) {
            case 0:
                this.f17007b.lambda$uploadMultiMedia$59(this.f17008c, this.d, this.e);
                return;
            default:
                this.f17007b.lambda$performSendDelayedMessage$51(this.f17008c, this.d, this.e);
                return;
        }
    }
}
