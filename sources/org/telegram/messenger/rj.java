package org.telegram.messenger;

import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rj implements Runnable {
    public final int f18315a;
    public final SendMessagesHelper f18316b;
    public final TLObject f18317c;
    public final TLRPC.InputMedia d;
    public final SendMessagesHelper.DelayedMessage e;

    public rj(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10) {
        this.f18315a = i10;
        this.f18316b = sendMessagesHelper;
        this.f18317c = tLObject;
        this.d = inputMedia;
        this.e = delayedMessage;
    }

    @Override
    public final void run() {
        switch (this.f18315a) {
            case 0:
                this.f18316b.lambda$uploadMultiMedia$59(this.f18317c, this.d, this.e);
                return;
            default:
                this.f18316b.lambda$performSendDelayedMessage$51(this.f18317c, this.d, this.e);
                return;
        }
    }
}
