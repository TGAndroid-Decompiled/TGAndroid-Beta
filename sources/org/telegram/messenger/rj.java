package org.telegram.messenger;

import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rj implements Runnable {
    public final int f19915a;
    public final SendMessagesHelper f19916b;
    public final TLObject f19917c;
    public final TLRPC.InputMedia d;
    public final SendMessagesHelper.DelayedMessage f19918e;

    public rj(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10) {
        this.f19915a = i10;
        this.f19916b = sendMessagesHelper;
        this.f19917c = tLObject;
        this.d = inputMedia;
        this.f19918e = delayedMessage;
    }

    @Override
    public final void run() {
        switch (this.f19915a) {
            case 0:
                this.f19916b.lambda$uploadMultiMedia$59(this.f19917c, this.d, this.f19918e);
                return;
            default:
                this.f19916b.lambda$performSendDelayedMessage$51(this.f19917c, this.d, this.f19918e);
                return;
        }
    }
}
