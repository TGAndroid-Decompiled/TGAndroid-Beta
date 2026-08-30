package org.telegram.messenger;

import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rj implements Runnable {
    public final int f18337a;
    public final SendMessagesHelper f18338b;
    public final TLObject f18339c;
    public final TLRPC.InputMedia d;
    public final SendMessagesHelper.DelayedMessage e;

    public rj(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10) {
        this.f18337a = i10;
        this.f18338b = sendMessagesHelper;
        this.f18339c = tLObject;
        this.d = inputMedia;
        this.e = delayedMessage;
    }

    @Override
    public final void run() {
        switch (this.f18337a) {
            case 0:
                this.f18338b.lambda$uploadMultiMedia$59(this.f18339c, this.d, this.e);
                return;
            default:
                this.f18338b.lambda$performSendDelayedMessage$51(this.f18339c, this.d, this.e);
                return;
        }
    }
}
