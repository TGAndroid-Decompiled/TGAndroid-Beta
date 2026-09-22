package org.telegram.messenger;

import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class oj implements Runnable {
    public final int f17218a;
    public final SendMessagesHelper f17219b;
    public final TLObject f17220c;
    public final TLRPC.InputMedia d;
    public final SendMessagesHelper.DelayedMessage e;

    public oj(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10) {
        this.f17218a = i10;
        this.f17219b = sendMessagesHelper;
        this.f17220c = tLObject;
        this.d = inputMedia;
        this.e = delayedMessage;
    }

    @Override
    public final void run() {
        switch (this.f17218a) {
            case 0:
                this.f17219b.lambda$uploadMultiMedia$59(this.f17220c, this.d, this.e);
                return;
            default:
                this.f17219b.lambda$performSendDelayedMessage$51(this.f17220c, this.d, this.e);
                return;
        }
    }
}
