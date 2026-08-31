package org.telegram.messenger;

import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rj implements Runnable {
    public final int f19913a;
    public final SendMessagesHelper f19914b;
    public final TLObject f19915c;
    public final TLRPC.InputMedia d;
    public final SendMessagesHelper.DelayedMessage f19916e;

    public rj(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10) {
        this.f19913a = i10;
        this.f19914b = sendMessagesHelper;
        this.f19915c = tLObject;
        this.d = inputMedia;
        this.f19916e = delayedMessage;
    }

    @Override
    public final void run() {
        switch (this.f19913a) {
            case 0:
                this.f19914b.lambda$uploadMultiMedia$59(this.f19915c, this.d, this.f19916e);
                return;
            default:
                this.f19914b.lambda$performSendDelayedMessage$51(this.f19915c, this.d, this.f19916e);
                return;
        }
    }
}
